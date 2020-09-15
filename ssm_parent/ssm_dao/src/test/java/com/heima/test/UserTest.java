package com.heima.test;

import com.heima.bean.Items;
import com.heima.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * 2 * @Author: liwanlei
 * 3 * @Date: 2020/9/14 20:09
 * 4
 */
//
public class UserTest {
    @Test
    public  void  test(){
        ClassPathXmlApplicationContext app= new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = app.getBean(ItemsDao.class);
        Items items=new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);

        System.out.println("商品列表："+itemsDao.findAll());



    }

}
