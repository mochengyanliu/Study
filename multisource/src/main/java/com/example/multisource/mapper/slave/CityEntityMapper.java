package com.example.multisource.mapper.slave;

import com.example.multisource.entity.CityEntity;

public interface CityEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CityEntity record);

    int insertSelective(CityEntity record);

    CityEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CityEntity record);

    int updateByPrimaryKey(CityEntity record);

    CityEntity selectCityByUserId(int id);
}