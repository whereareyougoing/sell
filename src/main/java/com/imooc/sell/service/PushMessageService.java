package com.imooc.sell.service;

import com.imooc.sell.DTO.OrderDTO;

/**
 * @author 宋艾衡
 * @date 2019/7/2 15:18
 * @desc
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
