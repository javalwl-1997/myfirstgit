package com.heima.dao;

import com.heima.bean.Items;

import java.util.List;

/**
 * 2 * @Author: liwanlei
 * 3 * @Date: 2020/9/14 19:45
 * 4
 */
public interface ItemsDao {
    /***
     * 查询所有
     * @return
     */
    List<Items> findAll();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
}
