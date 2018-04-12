package com.spootboot.demo.control;

import com.spootboot.demo.Bean.ConfigBean;
import com.spootboot.demo.Bean.MyConfigBean;
import com.spootboot.demo.Bean.RandomBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
自动注入使用bean configBean
 */
@RestController
public class UserController {
    @Autowired
    ConfigBean configBean;

    @Autowired
    MyConfigBean myConfigBean;

    @Autowired
    RandomBean randomBean;

    @RequestMapping("/configbean")
    public String hello(){
        return configBean.getName()+configBean.getWant()+"  "+configBean.getHello();
    }

    @RequestMapping("/myconfig")
    public String hello2(){
        return myConfigBean.getName()+myConfigBean.getNumber();
    }

    @RequestMapping("/randomconfig")
    public String hello3(){
        return randomBean.getSecret()+" "+randomBean.getUuid()+"  "+randomBean.getNumber();
    }
}