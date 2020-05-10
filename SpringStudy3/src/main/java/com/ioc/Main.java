package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:wangrui
 * @Date:2020/5/6 17:54
 */
public class Main {
    public static void main(String[] args) {
        //加载Spring的配置文件，初始化上下文
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");
        //通过名字获取Bean对象
       /* Object o = context.getBean("myName");
        System.out.println(o.getClass());
        System.out.println(o);*/
        /*Object o = context.getBean("duck");
        System.out.println(o.getClass());
        System.out.println(o);*/

        /*Object duck1 = context.getBean("duck1");
        System.out.println(duck1.getClass());
        System.out.println(duck1);
        Object duck2= context.getBean("duck2");
        System.out.println(duck2.getClass());
        System.out.println(duck2);
        Object duckshop = context.getBean("duckshop");
        System.out.println(duckshop.getClass());
        System.out.println(duckshop);*/
        //通过类型来获取对象，容器中只能有一个该类型的对象
        /*Object duckshop = context.getBean(DuckShop.class);
        System.out.println(duckshop.getClass());
        System.out.println(duckshop);*/
        //存在两只鸭子，通过类型获取Bean，直接抛出异常
        /*Object duck = context.getBean(Duck.class);
        System.out.println(duck.getClass());
        System.out.println(duck);*/

        /*Object duck6 = context.getBean("duck6");
        System.out.println(duck6.getClass());
        System.out.println(duck6);*/

       /* LoginController loginController = (LoginController)context.getBean("loginController");
        System.out.println(loginController.getLoginService());
        System.out.println(loginController.getDuck3());*/
    }
}
