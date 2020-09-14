package com.example.builderpattern.server.impl;

import com.example.builderpattern.server.Soup;
import com.example.builderpattern.server.SoupBuilder;

/**
 * @Author lijun
 * @Description 玉米排骨汤构建者
 * @Date 2020-04-03 8:38 上午
 **/

public class YuMiPaiGuSoupBuilder implements SoupBuilder {
    private YuMiPaiGuSoup yuMiPaiGuSoup = new YuMiPaiGuSoup();


    @Override
    public void buildSoup() {
        // 加排骨
        yuMiPaiGuSoup.addRibs();
        // 加玉米
        yuMiPaiGuSoup.addVegetable();
        // 熬40分钟
        yuMiPaiGuSoup.minute(40);
        // 添调料
        yuMiPaiGuSoup.addIngredients();
    }

    @Override
    public Soup getSoup() {
        return yuMiPaiGuSoup;
    }
}
