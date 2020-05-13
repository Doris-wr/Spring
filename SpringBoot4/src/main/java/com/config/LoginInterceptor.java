package com.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author:wangrui
 * @Date:2020/5/12 9:25
 */
public class LoginInterceptor  implements HandlerInterceptor {
    @Override
    /*
     * 功能描述:Contorller类方法调用前，如果匹配到拦截器的url，就会调用pewHandle进行处理
     * @return boolean
     */
    //return true 就能继续进行访问（可以调用Controller中的方法，或是访问某个页面）
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        HttpSession session=request.getSession(false);//获取session，如果没有，返回null
        if(session!=null){
            Object user=session.getAttribute("user");
            if(user!=null){
                return true;
            }
        }
        response.sendRedirect("login.html" );
        return false;
    }
}
