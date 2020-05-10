package com.reflect;

import com.ioc.Duck;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author:wangrui
 * @Date:2020/5/10 22:21
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception  {
        //Class<Duck>clazz=Duck.class;
        Class<?>clazz=Class.forName("com.ioc.Duck");
        //通过类对象，生成对象的实例，通过构造方法生成
        //无参构造方法创建
        Duck duck=(Duck)clazz.newInstance();
        System.out.println(duck);
        //有参的构造方法创建
        Duck duck2=(Duck) clazz.getConstructor(String.class).newInstance("小黄鸭");
        System.out.println(duck2);
        //获取类的属性+ 对象的属性
        Field[] fields=Duck.class.getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            System.out.println(field.getName()+"="+field.get(duck2));
        }
        //通过对象调用方法
        Method method = Duck.class.getDeclaredMethod("setName", String.class);
        method.invoke(duck2,"小黄鹂");//类似于duck2.setName(”小黄鹂“)方法调用
        System.out.println(duck2);
    }
}
