package com.heima.service;

import com.heima.bean.Items;

import java.util.List;

/**
 * 2 * @Author: liwanlei
 * 3 * @Date: 2020/9/14 20:41
 * 4
 */
public interface ItemsService {
    /***
     * 列表查询
     * @return
     */
    List<Items> findAll();

    /***
     * 增加商品
     * @param items
     * @return
     */
    int save(Items items);
}
