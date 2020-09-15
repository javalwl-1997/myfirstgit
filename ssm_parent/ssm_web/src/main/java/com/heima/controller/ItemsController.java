package com.heima.controller;

import com.heima.bean.Items;
import com.heima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 2 * @Author: liwanlei
 * 3 * @Date: 2020/9/15 14:56
 * 4
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/list")
    public  String  listTest(Model model){
        //集合查询
        List<Items> items = itemsService.findAll();
        model.addAttribute("items",items);
        return  "items";
    }
    @RequestMapping("/save")
    public  String  saveTest(Items items){
        //集合查询
        int i = itemsService.save(items);
        return  "redirect:/items/list";
    }
}
