package com.imooc.sell.service;

import com.imooc.sell.dataobject.SellerInfo;

/**
 * @author 宋艾衡
 * @date 2019/7/2 16:16
 * @desc
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
