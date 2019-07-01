package com.imooc.sell.repostory;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 宋艾衡
 * @date 2019/7/1 17:33
 * @desc
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

     List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeIn);
}
