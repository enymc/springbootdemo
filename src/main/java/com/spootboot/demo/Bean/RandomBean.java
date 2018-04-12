package com.spootboot.demo.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
@ConfigurationProperties(prefix="my")
@PropertySource("classpath:myConfig.properties")
public class RandomBean {
    private String secret;
    private int number;
    private String uuid;

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSecret() {

        return secret;
    }

    public int getNumber() {
        return number;
    }

    public String getUuid() {
        return uuid;
    }
}
