package com.example.multisource.service.impl;

import com.example.multisource.entity.CityEntity;
import com.example.multisource.entity.UserEntity;
import com.example.multisource.mapper.master.UserEntityMapper;
import com.example.multisource.mapper.slave.CityEntityMapper;
import com.example.multisource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserEntityMapper userEntityMapper;

    @Autowired
    CityEntityMapper cityEntityMapper;

    @Override
    public Map<String, Object> getUserInfo(int id) {
        UserEntity userEntity = userEntityMapper.selectByPrimaryKey(id);
        CityEntity cityEntity = cityEntityMapper.selectCityByUserId(id);
        Map<String, Object> map = new HashMap<>();
        map.put("userEntity", userEntity);
        map.put("cityEntity", cityEntity);
        return map;
    }
}
