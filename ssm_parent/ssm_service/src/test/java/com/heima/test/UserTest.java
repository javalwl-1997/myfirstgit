package com.heima.test;

import com.heima.bean.Items;
import com.heima.service.ItemsService;
import com.heima.service.impl.ItemsServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * 2 * @Author: liwanlei
 * 3 * @Date: 2020/9/14 20:45
 * 4
 */
public class UserTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService)app.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("添加事务");
        itemsService.save(items);

    }

}
