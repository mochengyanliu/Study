package com.shiro.manager.mapper;

import com.shiro.manager.entity.RoleAuthEntity;

public interface RoleAuthEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleAuthEntity record);

    int insertSelective(RoleAuthEntity record);

    RoleAuthEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleAuthEntity record);

    int updateByPrimaryKey(RoleAuthEntity record);
}