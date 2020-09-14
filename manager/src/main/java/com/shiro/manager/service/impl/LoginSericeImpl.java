package com.shiro.manager.service.impl;

import com.shiro.manager.dto.RoleDto;
import com.shiro.manager.dto.UserDto;
import com.shiro.manager.mapper.AuthEntityMapper;
import com.shiro.manager.mapper.RoleEntityMapper;
import com.shiro.manager.mapper.UserEntityMapper;
import com.shiro.manager.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LoginSericeImpl implements LoginService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Autowired
    private RoleEntityMapper roleEntityMapper;

    @Autowired
    private AuthEntityMapper authEntityMapper;

    @Override
    public UserDto findByAccount(String account) {
        UserDto userDto = userEntityMapper.findByAccount(account);
        userDto.setRoleDtos(roleEntityMapper.findByUserId(userDto.getId()));
        for (RoleDto roleDto:userDto.getRoleDtos()) {
            roleDto.setAuthEntities(authEntityMapper.findByRoleId(roleDto.getId()));
        }
        return userDto;
    }
}
