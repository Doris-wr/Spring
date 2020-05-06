package com.ioc;

/**
 * @Author:wangrui
 * @Date:2020/5/6 19:32
 */
public class Duck {
    private String name;
    private int age;

    public Duck() {
    }

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Duck{"+
                "name="+name+
                ",age="+age+
                "}";
    }
}
