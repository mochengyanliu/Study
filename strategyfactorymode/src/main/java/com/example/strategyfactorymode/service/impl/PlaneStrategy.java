package com.example.strategyfactorymode.service.impl;

import com.example.strategyfactorymode.factory.CalculateStrategyFactory;
import com.example.strategyfactorymode.service.CalculateStrategy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @Author lijun
 * @Description 乘飞机
 * @Date 2020-03-30 8:47 上午
 **/

@Service
public class PlaneStrategy implements CalculateStrategy, InitializingBean {
    @Override
    public String price(int km) {
        // 乘飞机，按每公里50元计算
        return "乘飞机所需要的费用是：￥" + 50 * km;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        CalculateStrategyFactory.register("plane", this);
    }
}
