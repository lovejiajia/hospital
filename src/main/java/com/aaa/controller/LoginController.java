package com.aaa.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("sel")
public class LoginController {

    @RequestMapping("tologin")
    public String toLogin(){
        return "view/login";
    }

    @RequestMapping("login")
    public String login(HttpRequest httpRequest, String loginName, String pwd){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, pwd);
        try {
            subject.login(token);
            return "view/index";
        } catch (UnknownAccountException e) {
            //用户为空或不存在
            return "view/login";
        } catch (IncorrectCredentialsException e) {
            return "view/login";
        }
    }
}
