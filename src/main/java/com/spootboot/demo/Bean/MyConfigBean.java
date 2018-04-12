package com.spootboot.demo.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
/*
获取自定义配置文件中的常量
 */
@Configuration
@ConfigurationProperties(prefix = "")
@PropertySource("classpath:myConfig.properties")
public class MyConfigBean {
    private String name;
    private int number;
    private int port;


    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {

        return name;
    }

    public int getNumber() {
        return number;
    }
}
