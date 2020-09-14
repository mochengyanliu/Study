package com.example.strategyfactorymode.service.impl;

import com.example.strategyfactorymode.factory.CalculateStrategyFactory;
import com.example.strategyfactorymode.service.CalculateStrategy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @Author lijun
 * @Description 乘火车
 * @Date 2020-03-30 8:49 上午
 **/
@Service
public class TrainStrategy implements CalculateStrategy, InitializingBean {
    @Override
    public String price(int km) {
        // 乘火车，按每公里0.1元计算
        return "乘火车所需要的费用是：￥" + 0.1 * km;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        CalculateStrategyFactory.register("train", this);
    }
}
