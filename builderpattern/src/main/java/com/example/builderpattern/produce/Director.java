package com.example.builderpattern.produce;

import com.example.builderpattern.server.impl.TuDouPaiGuSoupBuilder;
import com.example.builderpattern.server.impl.TuDouPaiguSoup;
import com.example.builderpattern.server.impl.YuMiPaiGuSoup;
import com.example.builderpattern.server.impl.YuMiPaiGuSoupBuilder;

/**
 * @Author lijun
 * @Description 熬汤人
 * @Date 2020-04-03 8:44 上午
 **/

public class Director {
    private TuDouPaiGuSoupBuilder tuDouPaiGuSoupBuilder = new TuDouPaiGuSoupBuilder();
    private YuMiPaiGuSoupBuilder yuMiPaiGuSoupBuilder = new YuMiPaiGuSoupBuilder();

    /**
     * 熬土豆排骨汤
     * @return
     */
    public TuDouPaiguSoup buildTuDouPaiguSoup() {
        tuDouPaiGuSoupBuilder.buildSoup();
        return (TuDouPaiguSoup) tuDouPaiGuSoupBuilder.getSoup();
    }

    /**
     * 熬玉米排骨汤
     * @return
     */
    public YuMiPaiGuSoup buildYuMiPaiGuSoup() {
        yuMiPaiGuSoupBuilder.buildSoup();
        return (YuMiPaiGuSoup) yuMiPaiGuSoupBuilder.getSoup();
    }
}
