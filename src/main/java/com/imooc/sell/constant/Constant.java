package com.imooc.sell.constant;

import lombok.Getter;

/**
 * @author 宋艾衡
 * @date 2019/7/2 10:58
 * @desc
 *
 * 这样的状态最好维护在枚举类里面，魔法数字，或者一些单独的string提示可以使用这样的方式实现
 *
 */
public class Constant {

    interface Result{
        public static final String SUCCESS_MSG = "成功";
        public static final Integer SUCCESS_CODE = 1;
        public static final Boolean SUCCESS_STATUS = true;

        public static final String FAIL_MSG = "失败";
        public static final Integer FAIL_CODE = 0;
        public static final Boolean FAIL_STATUS = false;


        public static final String ERROR_MSG = "系统错误";
        public static final Integer ERROR_CODE = 2;
        public static final Boolean ERROR_STATUS = false;
    }

    @Getter
    public enum Res{

        SUCCESS(1,"成功",true),
        FALIL(0,"失败",false),
        ERROR(2,"系统错误",false);

        private Integer code;
        private String msg;
        private Boolean status;

        Res(Integer code,String msg,Boolean status){

        }
    }

}
