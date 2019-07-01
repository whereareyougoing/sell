package com.imooc.sell.form;

import lombok.Data;

/**
 * @author 宋艾衡
 * @date 2019/7/1 18:30
 * @desc
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
