package com.shiro.manager.mapper;

import com.shiro.manager.dto.UserDto;
import com.shiro.manager.entity.UserEntity;

public interface UserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    UserDto findByAccount(String account);
}