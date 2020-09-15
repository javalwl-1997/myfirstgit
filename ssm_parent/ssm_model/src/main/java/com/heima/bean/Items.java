package com.heima.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 2 * @Author: liwanlei
 * 3 * @Date: 2020/9/14 18:21
 * 4
 */
@Data
public class Items implements Serializable {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
    //get..set..
}
