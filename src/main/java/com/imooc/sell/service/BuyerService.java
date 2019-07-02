package com.imooc.sell.service;

import com.imooc.sell.DTO.OrderDTO;

/**
 * @author 宋艾衡
 * @date 2019/7/2 15:38
 * @desc
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
