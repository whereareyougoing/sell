package com.imooc.sell.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 表名称是product_catagory jpa会自动转换成驼峰命名，如果不是可以使用@table
 */
@Table(name = "product_catagory")
@Entity
public class ProductCatagory {

    @Id
    @GeneratedValue
    @Getter@Setter
    private Integer categoryId;
    @Getter@Setter
    private String categoryName;
    @Getter@Setter
    private String categoryType;



}
