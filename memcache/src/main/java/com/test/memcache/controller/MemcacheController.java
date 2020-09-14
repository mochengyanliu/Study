package com.test.memcache.controller;

import com.test.memcache.entity.UserEntity;
import com.whalin.MemCached.MemCachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MemcacheController {
    @Autowired
    private MemCachedClient memCachedClient;

    @RequestMapping("/listUser")
    public UserEntity listUser(@RequestParam Integer userId){
        UserEntity userEntity = (UserEntity) memCachedClient.get("user:"+userId);
        if (userEntity == null) {
            System.out.println("没有缓存");
            userEntity = new UserEntity();
            userEntity.setId(2);
            userEntity.setName("老王");
            userEntity.setSex("男");
            userEntity.setAge(24);
            userEntity.setTel(17789899090L);
            userEntity.setEmail("1011212@qq.com");
            userEntity.setAddress("上海浦东新区");
            //设置缓存，并设置20秒过期
            memCachedClient.set("user:"+userEntity.getId(),userEntity,new Date(20000));
        } else {
            System.out.println("加载缓存");
        }
        return userEntity;
    }
}
