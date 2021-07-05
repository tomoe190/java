package org.example;

import org.example.config.AppConfig;
import org.example.controller.LoginController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//根据Spring配置文件路径创建容器：应用上下文对象
        // 启动容器：加载配置文件，扫描org.example包
        // 该包及下面的子包中的带Spring注解的类都会注册到容器中，称为Bean对象
        // 容器可以简答理解为一个Map结构，key为Bean的id或名称，value为bean对象
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");

        //1、获取Bean对象的方式之一：类型获取
        LoginController loginController = context.getBean(LoginController.class);
        System.out.println(loginController);

        //2、获取Bean对象的方式二：bean的名称或者id
        LoginController loginController2 = (LoginController) context.getBean("loginController");
        System.out.println(loginController2);

        // 一个类型，可以注册多个bean对象到容器中
        // 通过类型获取，容器只能存在该类型一个bean，否则就会报错
        // 通过名称/id获取，就可以任意
//        LoginController.Tmp tmp = context.getBean(LoginController.Tmp.class);
//        System.out.println(tmp);
        LoginController.Tmp tmp = (LoginController.Tmp) context.getBean("tmpFactory");
        System.out.println(tmp);

        AppConfig appConfig = context.getBean(AppConfig.class);
        System.out.println(appConfig);

        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}