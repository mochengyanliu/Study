package com.test.durid.controller;

import com.test.durid.entity.CityEntity;
import com.test.durid.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/city")
    public CityEntity findCityById(@RequestParam Integer id){
        return cityService.findCityById(id);
    }
}
