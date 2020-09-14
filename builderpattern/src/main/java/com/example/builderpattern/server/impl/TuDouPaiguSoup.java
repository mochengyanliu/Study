package com.example.builderpattern.server.impl;

import com.example.builderpattern.server.Soup;

/**
 * @Author lijun
 * @Description 土豆排骨汤
 * @Date 2020-04-03 9:48 上午
 **/

public class TuDouPaiguSoup implements Soup {
    @Override
    public void addRibs() {
        System.out.println("加排骨");
    }

    @Override
    public void addVegetable() {
        System.out.println("加土豆");
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
