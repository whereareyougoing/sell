package com.gwd;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/**
 * @author 宋艾衡
 * @date 2019/7/3 15:03
 * @desc
 *
 * 自定义properties配置文件
 *
 */
@Component
@ConfigurationProperties(prefix="custom") // 用来指定properties配置文件中的key前缀
@PropertySource("classpath:config/custom.properties") //配置文件所在位置
public class CustomProperties {

    private String name;

    private Integer age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }

    public void setAge(Integer age) { this.age = age; }

    @Override
    public String toString() { return "CustomProperties [name=" + name + ", age=" + age + "]"; }
}

