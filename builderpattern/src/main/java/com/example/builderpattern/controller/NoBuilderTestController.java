package com.example.builderpattern.controller;

import com.example.builderpattern.server.impl.TuDouPaiguSoup;
import com.example.builderpattern.server.impl.YuMiPaiGuSoup;

/**
 * @Author lijun
 * @Description
 * @Date 2020-04-03 9:31 上午
 **/

public class NoBuilderTestController {
    public static void main(String[] args) {
        // 熬土豆排骨汤
        TuDouPaiguSoup tuDouPaiguSoup = new TuDouPaiguSoup();
        // 加排骨
        tuDouPaiguSoup.addRibs();
        // 熬30分钟
        tuDouPaiguSoup.minute(30);
        // 加土豆
        tuDouPaiguSoup.addVegetable();
        // 熬15分钟
        tuDouPaiguSoup.minute(15);
        // 加调料
        tuDouPaiguSoup.addIngredients();

        // 熬玉米排骨汤
        YuMiPaiGuSoup yuMiPaiGuSoup = new YuMiPaiGuSoup();
        // 加排骨
        yuMiPaiGuSoup.addRibs();
        // 加玉米
        yuMiPaiGuSoup.addVegetable();
        // 熬40分钟
        yuMiPaiGuSoup.minute(40);
        // 加调料
        yuMiPaiGuSoup.addIngredients();
    }
}
