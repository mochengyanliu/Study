package com.example.builderpattern.server.impl;

import com.example.builderpattern.server.Soup;
import com.example.builderpattern.server.SoupBuilder;

/**
 * @Author lijun
 * @Description 土豆排骨汤构建者
 * @Date 2020-04-03 8:38 上午
 **/

public class TuDouPaiGuSoupBuilder implements SoupBuilder {
    private TuDouPaiguSoup tuDouPaiguSoup = new TuDouPaiguSoup();


    @Override
    public void buildSoup() {
        // 加排骨
        tuDouPaiguSoup.addRibs();
        // 熬30分钟
        tuDouPaiguSoup.minute(30);
        // 加土豆
        tuDouPaiguSoup.addVegetable();
        // 熬10分钟
        tuDouPaiguSoup.minute(15);
        // 添调料
        tuDouPaiguSoup.addIngredients();
    }

    @Override
    public Soup getSoup() {
        return tuDouPaiguSoup;
    }
}
