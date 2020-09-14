package com.example.builderpattern.server.impl;

import com.example.builderpattern.server.Soup;

/**
 * @Author lijun
 * @Description 玉米排骨汤
 * @Date 2020-04-03 9:55 上午
 **/

public class YuMiPaiGuSoup implements Soup {

    @Override
    public void addRibs() {
        System.out.println("加排骨");
    }

    @Override
    public void addVegetable() {
        System.out.println("加玉米");
    }

    @Override
    public void minute(int minute) {
        System.out.println("熬" + minute + "分钟");
    }

    @Override
    public void addIngredients() {
        System.out.println("添加各种调料");
    }
}
