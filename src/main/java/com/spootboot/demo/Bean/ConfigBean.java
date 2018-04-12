package com.spootboot.demo.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
将springboot配置常量绑定到一个对应的bean上
 */
@ConfigurationProperties(prefix = "com.cn")
public class ConfigBean {
    private String name;
    private String want;

    public String getHello() {
        return hello;
    }

    private String hello;

    public void setHello(String hello) {
        this.hello = hello;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWant(String want) {
        this.want = want;
    }

    public String getName() {

        return name;
    }

    public String getWant() {
        return want;
    }
}
