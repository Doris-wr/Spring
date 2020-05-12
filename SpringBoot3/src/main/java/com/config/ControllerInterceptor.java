package com.config;

import com.model.Duck;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:wangrui
 * @Date:2020/5/12 13:54
 */
@ControllerAdvice
@Configuration
public class ControllerInterceptor {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Duck handle(){
        return new Duck("异常鸭子",123);
    }
}
