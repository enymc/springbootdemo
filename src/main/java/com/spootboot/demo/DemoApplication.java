package com.spootboot.demo;

import com.spootboot.demo.Bean.ConfigBean;
import com.spootboot.demo.Bean.MyConfigBean;
import com.spootboot.demo.Bean.RandomBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication//开启自动配置
@EnableConfigurationProperties({ConfigBean.class,MyConfigBean.class,RandomBean.class})//指明加载那个bena
public class DemoApplication {

    @RequestMapping
    public String index(){
        return "Hello spring boot 我是万能的";
    }
    //项目启动入口
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
