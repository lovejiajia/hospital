package com.aaa.config;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShrioConfig {

    //用户
    @Bean("userRealm")
    public UserRealm getUserRealm(@Qualifier("hashedCredentialsMatcher") HashedCredentialsMatcher hashedCredentialsMatcher){
        UserRealm userRealm = new UserRealm();
        userRealm.setCredentialsMatcher(hashedCredentialsMatcher);//设置密码迭代规则
        return userRealm;
    }

    //安全管理器
    @Bean("defaultWebSecurityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(userRealm);
        return defaultWebSecurityManager;
    }

    //用户权限管理
    @Bean("shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager")DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        Map<String, String> filtermap = new LinkedHashMap<String, String>();
        //toLogin/login界面可以未认证直接访问

        filtermap.put("/*", "anon");
       /* filtermap.put("/sel/login", "anon");
        filtermap.put("index.html", "anon");
        filtermap.put("/css/**", "anon");
        filtermap.put("/layui/**", "anon");
        filtermap.put("/js/**", "anon");
        filtermap.put("/images/**", "anon");
        filtermap.put("*.png", "anon");
        filtermap.put("*jpg", "anon");
        //未认证都不允许通过
        filtermap.put("/**", "authc");*/

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filtermap);
        //如果访问的页面未认证   跳转到登陆页面
        shiroFilterFactoryBean.setLoginUrl("/sel/toLogin");

        return shiroFilterFactoryBean;
    }

    //密码加密规则
    @Bean(name = "hashedCredentialsMatcher")
    public HashedCredentialsMatcher getHashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        //设置比较规则
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        //迭代2次
        hashedCredentialsMatcher.setHashIterations(2);
        return hashedCredentialsMatcher;
    }
}
