package com.controller;

import com.model.Duck;
import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author:wangrui
 * @Date:2020/5/11 0:39
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        System.out.printf("username=%s,password=%s\n", user.getUsername(), user.getPassword());
        if("abc".equals(user.getUsername())&&"123".equals(user.getPassword())){
            HttpSession session=request.getSession();//默认是true，如果获取不到session就创建
            session.setAttribute("user",user);
            return "redirect:/user/login6";//登陆成功，返回首页
        }else if("a".equals(user.getUsername())){
            throw new RuntimeException("用户名为a，出错了");
        }else{
            return "/login.html";
        }
    }

    @RequestMapping("/login_0")
    @ResponseBody
    public Duck login_0(User user) {
        System.out.printf("username=%s,password=%s\n", user.getUsername(), user.getPassword());
        return new Duck("LadyGaga0", 5);
    }

    @RequestMapping("/login2")
    public String login2() {
        return "/login.html";
    }

    @RequestMapping("/login3")
    public String login3() {
        //先做一部分业务
        return "redirect:/user/login";
    }

    @RequestMapping(value = "/{id}/login4", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Duck login4(@PathVariable("id") Integer id) {
        System.out.printf("id=%s\n", id);
        return new Duck("LadyGaga", 2);
    }

    @RequestMapping(value = "/login5", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Duck login5(@RequestBody User user) {
        System.out.printf("username=%s,passwprd=%s\n", user.getUsername(), user.getPassword());
        return new Duck("LadyGaga0", 3);
    }
    @RequestMapping("/login6")
    public String login6(Model model){//返回freemark动态网页模板生成的网页内容
        model.addAttribute("duck",new Duck("LadyGaga0", 3));
        return "/index";
    }
}
