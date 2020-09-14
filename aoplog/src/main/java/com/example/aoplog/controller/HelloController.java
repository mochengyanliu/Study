package com.example.aoplog.controller;

import com.example.aoplog.aop.EagleEye;
import com.example.aoplog.vo.HelloVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lijun
 * @Description
 * @Date 2020-05-27 11:05 上午
 **/

@RestController
public class HelloController {

    @RequestMapping("/hello")
    @EagleEye(desc = "hello接口")
    public String hello(@RequestBody HelloVO helloVO){
        return "hello," + helloVO.getName();
    }
}
