package com.example.strategyfactorymode.service.impl;

import com.example.strategyfactorymode.factory.CalculateStrategyFactory;
import com.example.strategyfactorymode.service.CalculateStrategy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @Author lijun
 * @Description 自己开车
 * @Date 2020-03-30 8:44 上午
 **/

@Service
public class CarStrategy implements CalculateStrategy, InitializingBean {

    @Override
    public String price(int km) {
        // 自己开车，按每公里0.5计算
        return "自己开车所需要的费用是：￥" + 0.5 * km;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        CalculateStrategyFactory.register("car", this);
    }
}
