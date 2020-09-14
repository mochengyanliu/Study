package com.example.strategyfactorymode.TestController;

import com.example.strategyfactorymode.Enum.Calculator;

/**
 * @Author lijun
 * @Description 策略枚举
 * @Date 2020-03-30 8:51 上午
 *
 * 策略枚举是一个非常优秀和方便的模式，但是其受到枚举类型的限制，
 * 每个枚举项都是public、final、static的，拓展性受到了一定的约束，
 * 因此在系统开发中，枚举策略一般担当不经常发生变的角色。
 **/

public class Client2 {
    static int km = 500;

    public static void main(String[] args) {
        String type = "car";

        if ("car".equals(type)) {
            // 选择自己开车
            System.out.println("自己开车所需要的费用是：￥" + Calculator.CAR.price(km));
        } else if ("plane".equals(type)) {
            // 选择乘飞机
            System.out.println("乘飞机所需要的费用是：￥" + Calculator.PLANE.price(km));
        } else if ("train".equals(type)) {
            // 选择乘火车
            System.out.println("乘火车所需要的费用是：￥" + Calculator.TRAIN.price(km));
        }
    }
}
