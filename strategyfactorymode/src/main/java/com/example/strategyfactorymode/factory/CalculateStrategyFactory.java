package com.example.strategyfactorymode.factory;

import com.example.strategyfactorymode.service.CalculateStrategy;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author lijun
 * @Description
 * @Date 2020-03-30 9:47 上午
 **/

public class CalculateStrategyFactory {
    private static Map<String, CalculateStrategy> services = new ConcurrentHashMap<>();

    public static CalculateStrategy getType(String type) {
        return services.get(type);
    }

    public static void register(String type, CalculateStrategy calculateStrategy) {
        Assert.notNull(type, "type can't be null");
        services.put(type, calculateStrategy);
    }
}
