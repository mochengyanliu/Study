package com.test.durid.mapper;

import com.test.durid.entity.CityEntity;

public interface CityEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CityEntity record);

    int insertSelective(CityEntity record);

    CityEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CityEntity record);

    int updateByPrimaryKey(CityEntity record);
}