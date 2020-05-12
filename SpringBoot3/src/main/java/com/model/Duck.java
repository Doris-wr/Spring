package com.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author:wangrui
 * @Date:2020/5/11 0:40
 */
@Setter
@Getter
public class Duck {
    private String name;
    private Integer age;

    public Duck(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
