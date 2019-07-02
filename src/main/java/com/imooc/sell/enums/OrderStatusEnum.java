package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @author 宋艾衡
 * @date 2019/7/2 11:34
 * @desc
 */

@Getter
public enum  OrderStatusEnum implements CodeEnum {


    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
