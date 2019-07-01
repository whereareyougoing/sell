package com.imooc.sell.DTO;

import lombok.Data;

/**
 * @author 宋艾衡
 * @date 2019/7/1 21:46
 * @desc
 */

@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
