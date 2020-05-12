package com.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author:wangrui
 * @Date:2020/5/12 9:20
 */
public class MVCConfig  implements WebMvcConfigurer {
    /*
     * 功能描述:根据url进行拦截，调用配置的拦截器进行处理
     * @return void
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //除了login.html,/user.login两个url请求，其他全部要被拦截
        //所哟有的拦截器依次执行，interceptor。preHandle.映射方法———>interceptor.preHandle()
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login.html")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/error");

    }
}
