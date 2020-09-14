package com.example.builderpattern.server;

/**
 * @Author lijun
 * @Description 熬汤接口
 * @Date 2020-04-03 9:36 上午
 **/

public interface Soup {

    // 加排骨
    void addRibs();

    // 加菜
    void addVegetable();

    // 熬制时间
    void minute(int minute);

    // 加配料
    void addIngredients();
}
