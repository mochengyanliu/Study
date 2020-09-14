package com.shiro.manager.mapper;

import com.shiro.manager.dto.RoleDto;
import com.shiro.manager.entity.RoleEntity;

import java.util.List;

public interface RoleEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleEntity record);

    int insertSelective(RoleEntity record);

    RoleEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleEntity record);

    int updateByPrimaryKey(RoleEntity record);

    List<RoleDto> findByUserId(Integer userId);
}