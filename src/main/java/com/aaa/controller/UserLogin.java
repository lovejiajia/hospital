package com.aaa.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登录类
 */
@RestController
@RequestMapping("sel")
public class UserLogin {

    @RequestMapping("login")
    public String userLogin(Model model, HttpServletRequest request, String name, String pwd){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(name, pwd);
        try{
            subject.login(token);
            return "view/index";
        } catch (UnknownAccountException e) {
            //用户为空或不存在
            model.addAttribute("msg", "不存在这样的用户!");
            return "view/login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码输入不对!");
            return "view/login";
        }
    }
}
