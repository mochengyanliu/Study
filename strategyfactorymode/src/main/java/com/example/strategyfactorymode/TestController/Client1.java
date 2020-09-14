package com.example.strategyfactorymode.TestController;

import com.example.strategyfactorymode.service.CalculateStrategy;
import com.example.strategyfactorymode.service.impl.CarStrategy;
import com.example.strategyfactorymode.service.impl.PlaneStrategy;
import com.example.strategyfactorymode.service.impl.TrainStrategy;

/**
 * @Author lijun
 * @Description 策略模式
 * @Date 2020-03-30 8:51 上午
 *
 * 优点:
 * 1.算法可以自由切换。
 * 2.结构清晰明了，使用简单直观。
 * 3.操作封装更为彻底，简化了操作。
 * 4.耦合度大大降低，只要实现接口即可，无需做其他修改。
 *
 * 缺点
 * 1.随着策略的增加，策略类会越来越多。
 * 2.所有的策略都要暴露出去。
 **/

public class Client1 {
    CalculateStrategy calculateStrategy;
    static int km = 500;

    public static void main(String[] args) {
        Client1 client = new Client1();
        String type = "car";

        if ("car".equals(type)) {
            // 选择自己开车
            client.setCalculateStrategy(new CarStrategy());
            System.out.println(client.getPrice(km));
        } else if ("plane".equals(type)) {
            // 选择乘飞机
            client.setCalculateStrategy(new PlaneStrategy());
            System.out.println(client.getPrice(km));
        } else if ("train".equals(type)) {
            // 选择乘火车
            client.setCalculateStrategy(new TrainStrategy());
            System.out.println(client.getPrice(km));
        }
    }

    /**
     * 设置出行方式
     *
     * @param calculateStrategy
     */
    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    /**
     * 获取出行费用
     * @param km
     * @return
     */
    public String getPrice(int km) {
        return calculateStrategy.price(km);
    }
}
