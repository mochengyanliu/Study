package com.test.durid.service.impl;

import com.test.durid.entity.CityEntity;
import com.test.durid.mapper.CityEntityMapper;
import com.test.durid.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityEntityMapper cityEntityMapper;

    @Override
    public CityEntity findCityById(Integer id) {
        return cityEntityMapper.selectByPrimaryKey(id);
    }
}
