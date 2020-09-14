package com.shiro.manager.config;

import com.shiro.manager.dto.RoleDto;
import com.shiro.manager.dto.UserDto;
import com.shiro.manager.entity.AuthEntity;
import com.shiro.manager.service.LoginService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroRealm extends AuthorizingRealm {

    //用户查询
    @Autowired
    private LoginService loginService;

    //角色权限和对应的权限添加
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("--------权限配置-------");
        //获取登录用户名
        String account = (String) principalCollection.getPrimaryPrincipal();

        //查询用户名
        UserDto userDto = loginService.findByAccount(account);

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        for (RoleDto roleDto:userDto.getRoleDtos()){
            //添加角色
            simpleAuthorizationInfo.addRole(roleDto.getRoleName());

            //添加权限
            for (AuthEntity authEntity:roleDto.getAuthEntities()) {
                simpleAuthorizationInfo.addStringPermission(authEntity.getPermission());
            }
        }
        return simpleAuthorizationInfo;
    }

    //用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }

        //获取用户信息
        String name = authenticationToken.getPrincipal().toString();

        String password = new String((char[]) authenticationToken.getCredentials());
        UserDto userDto = loginService.findByAccount(name);
        if (userDto == null) {
            return null;
        } else if (!password.equals(userDto.getPassword())) {
            throw new IncorrectCredentialsException();
        } else if (userDto.getState() == 0) {
            throw new DisabledAccountException();
        } else if (userDto.getState() == 2) {
            throw new LockedAccountException();
        } else {
            SimpleAuthenticationInfo simpleAuthorizationInfo = new SimpleAuthenticationInfo(name, userDto.getPassword(), getName());
            return simpleAuthorizationInfo;
        }
    }
}
