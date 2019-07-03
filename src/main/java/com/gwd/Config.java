package com.gwd;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 宋艾衡
 * @date 2019/7/3 14:57
 * @desc
 *
 * 导入自定义的xml文件
 *
 */
@Configuration
@ImportResource(locations = {"classpath:application-bean.xml"})
public class Config {

}
