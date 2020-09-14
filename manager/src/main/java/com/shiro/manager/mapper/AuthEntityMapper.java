package com.shiro.manager.mapper;

import com.shiro.manager.entity.AuthEntity;

import java.util.List;

public interface AuthEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthEntity record);

    int insertSelective(AuthEntity record);

    AuthEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuthEntity record);

    int updateByPrimaryKey(AuthEntity record);

    List<AuthEntity> findByRoleId(Integer roleId);
}