package com.heima.service.impl;

import com.heima.bean.Items;
import com.heima.dao.ItemsDao;
import com.heima.service.ItemsService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

/**
 * 2 * @Author: liwanlei
 * 3 * @Date: 2020/9/14 20:42
 * 4
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public List<Items> findAll() {
        return  itemsDao.findAll();
    }

    public int save(Items items) {
        int i = itemsDao.save(items);
        System.out.println("i:"+i);
        return  i;

    }
}
