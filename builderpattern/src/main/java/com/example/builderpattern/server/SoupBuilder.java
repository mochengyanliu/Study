package com.example.builderpattern.server;

/**
 * @Author lijun
 * @Description 熬汤构建者接口
 * @Date 2020-04-03 8:37 上午
 **/

public interface SoupBuilder {
    void buildSoup();

    Soup getSoup();
}
