package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * @author 宋艾衡
 * @date 2019/7/1 18:35
 * @desc
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
