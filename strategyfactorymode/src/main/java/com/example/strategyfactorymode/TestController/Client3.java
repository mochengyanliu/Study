package com.example.strategyfactorymode.TestController;

import com.example.strategyfactorymode.StrategyfactorymodeApplication;
import com.example.strategyfactorymode.factory.CalculateStrategyFactory;
import com.example.strategyfactorymode.service.CalculateStrategy;
import org.springframework.boot.SpringApplication;

/**
 * @Author lijun
 * @Description 策略模式 + 工厂模式
 * @Date 2020-03-30 8:51 上午
 *
 * 彻底解决if-else
 **/

public class Client3 {
    static int km = 500;

    public static void main(String[] args) {
        SpringApplication.run(StrategyfactorymodeApplication.class, args);
        String type = "car";
        CalculateStrategy calculateStrategy = CalculateStrategyFactory.getType(type);
        System.out.println(calculateStrategy.price(km));
    }
}
