package com.shiro.manager.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@RequestMapping
@Controller
public class LoginController {

    //用于进入login页面
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login.html";
    }

    //登陆时用post请求
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody Map map){
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                map.get("account").toString(),
                map.get("password").toString());
        //进行验证
        subject.login(usernamePasswordToken);
        return "login.html";
    }

    //进入首页
    @RequestMapping(value = "/index")
    public String index(){
        return "index.html";
    }

    //登出
    @RequestMapping(value = "/logout")
    public String logout(){
        return "login.html";
    }

    //错误页面
    @RequestMapping(value = "/error", method = RequestMethod.POST)
    public String error(){
        return "error.html";
    }

    //用户列表 用户必须拥有userInfo权限
    @RequiresPermissions("userInfo")
    @RequestMapping(value = "/userInfo")
    public String userInfo(){
        return "userInfo.html";
    }

    //用户新增 用户必须拥有userInfoAdd权限
    @RequiresPermissions("userInfoAdd")
    @RequestMapping(value = "/userInfoAdd")
    public String userInfoAdd(){
        return "userInfoAdd.html";
    }

    //用户删除 用户必须拥有userInfoDel权限
    @RequiresPermissions("userInfoDel")
    @RequestMapping(value = "/userInfoDel")
    public String userInfoDel(){
        return "userInfoDel.html";
    }

    //用户更新 用户必须拥有userInfoUpd权限
    @RequiresPermissions("userInfoUpd")
    @RequestMapping(value = "/userInfoUpd")
    public String userInfoUpd(){
        return "userInfoUpd.html";
    }

}
