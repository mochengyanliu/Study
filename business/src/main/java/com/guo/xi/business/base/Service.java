package com.guo.xi.business.base;

import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * @Author lijun
 * @Description Service 层 基础接口，其他Service 接口 请继承该接口
 * @Date 2020-09-18 9:42 上午
 **/

public interface Service<T> {
    /**
     * 持久化
     * @param model
     */
    void save(T model);

    /**
     * 批量持久化
     * @param models
     */
    void save(List<T> models);

    /**
     * 通过主鍵刪除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 批量刪除 eg：ids -> “1,2,3,4”
     * @param ids
     */
    void deleteByIds(String ids);

    /**
     * 更新
     * @param model
     */
    void update(T model);

    /**
     * 通过ID查找
     * @param id
     * @return
     */
    T findById(Integer id);

    /**
     * 通过多个ID查找//eg：ids -> “1,2,3,4”
     * @param ids
     * @return
     */
    List<T> findByIds(String ids);

    /**
     * 根据条件查找
     * @param condition
     * @return
     */
    List<T> findByCondition(Condition condition);

    /**
     * 获取所有
     * @return
     */
    List<T> findAll();
}
