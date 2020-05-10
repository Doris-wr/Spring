package com.scan;

import com.ioc.Duck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author:wangrui
 * @Date:2020/5/7 13:49
 */

//@Controller（“Bean的名字”）
//@Controller默认以类名，首字母小写的方式注册Bean对象
@Controller
public class LoginController {
    /*
     * 装配Bean
     * ①Autowired：Spring的注解，只能Spring框架使用
     * ②Resource：jdk的注解，是一种装配资源类的规范，Spring实现了这个规范，所以也可以使用该注解
     */

    @Autowired
    private LoginService loginService;
    @Autowired
    private Duck duck3;

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public Duck getDuck3() {
        return duck3;
    }

    public void setDuck3(Duck duck3) {
        this.duck3 = duck3;
    }
}
