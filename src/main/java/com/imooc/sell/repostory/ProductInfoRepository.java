package com.imooc.sell.repostory;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 宋艾衡
 * @date 2019/7/1 21:49
 * @desc
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
