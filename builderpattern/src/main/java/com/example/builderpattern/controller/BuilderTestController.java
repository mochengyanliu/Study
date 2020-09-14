package com.example.builderpattern.controller;

import com.example.builderpattern.produce.Director;

/**
 * @Author lijun
 * @Description 使用构建者模式熬汤
 * @Date 2020-04-03 9:31 上午
 **/

public class BuilderTestController {
    public static void main(String[] args) {
        Director director = new Director();

        // 熬土豆排骨汤
        director.buildTuDouPaiguSoup();

        // 熬玉米排骨汤
        director.buildYuMiPaiGuSoup();
    }
}
