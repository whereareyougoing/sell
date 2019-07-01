package com.imooc.sell.util;

import com.imooc.sell.enums.CodeEnum;

/**
 * @author 宋艾衡
 * @date 2019/7/1 21:45
 * @desc
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}
