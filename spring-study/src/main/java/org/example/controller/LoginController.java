package org.example.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
    /**
     * 当前类能被Spring扫描到的情况下
     * 方法加上@Bean注解可以注册Bean：
     * 方法名作为Bean的名称（），返回值作为Bean对象
     */
    @Bean
    public Tmp tmp(){
        return new Tmp();
    }

    public static class Tmp{

    }
}
