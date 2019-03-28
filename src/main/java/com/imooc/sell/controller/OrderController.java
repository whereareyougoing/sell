package com.imooc.sell.controller;

import com.imooc.sell.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 宋艾衡
 * @date 2019-03-11 14:55
 */
public class OrderController {

    @Autowired
    private IOrderService orderService;

    public void add(){
        orderService.add();
    }


}
