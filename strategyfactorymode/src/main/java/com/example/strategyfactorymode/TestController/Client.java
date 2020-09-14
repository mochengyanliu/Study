package com.example.strategyfactorymode.TestController;

/**
 * @Author lijun
 * @Description if-else
 * @Date 2020-03-30 8:51 上午
 *
 * 简单，臃肿
 **/

public class Client {
    static int km = 500;

    public static void main(String[] args) {
        String type = "car";
        // 选择自己开车
        if ("car".equals(type)) {
            System.out.println("自己开车所需要的费用是：￥" + 0.5 * km);
        } else if ("plane".equals(type)){
            System.out.println("乘飞机所需要的费用是：￥" + 50 * km);
        } else if ("train".equals(type)){
            System.out.println("乘火车所需要的费用是：￥" + 0.1 * km);
        }
    }

}
