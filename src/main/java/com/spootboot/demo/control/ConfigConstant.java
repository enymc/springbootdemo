package com.spootboot.demo.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
获取配置文件常量
 */
@RestController
public class ConfigConstant {
    @Value("${com.cn.name}")
    private String name;

    @Value("${com.cn.want}")
    private String want;

    @RequestMapping("/haha")
    public String haha() {
        return name+","+want;
    }
}
