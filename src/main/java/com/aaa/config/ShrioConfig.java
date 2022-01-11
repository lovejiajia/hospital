package com.aaa.config;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShrioConfig {
    /**
     * 注入自定义的 Realm
     * @return MyRealm
     */
    @Bean
    public UserRealm myAuthRealm() {
        UserRealm myRealm = new UserRealm();
        return myRealm;
    }

    /**
     * 注入安全管理器
     * @return SecurityManager
     */
    @Bean
    public DefaultWebSecurityManager securityManager() {
        // 将自定义 Realm 加进来
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager(myAuthRealm());
        return securityManager;
    }

    /**
     * 注入 Shiro 过滤器
     * @param securityManager 安全管理器
     * @return ShiroFilterFactoryBean
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilter(DefaultWebSecurityManager securityManager) {
        // 定义 shiroFactoryBean
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();

        // 设置自定义的 securityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        // 设置默认登录的 URL，身份认证失败会访问该 URL
        shiroFilterFactoryBean.setLoginUrl("/login");
        // 设置成功之后要跳转的链接
        shiroFilterFactoryBean.setSuccessUrl("/success");
        // 设置未授权界面，权限认证失败会访问该 URL
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");

        // LinkedHashMap 是有序的，进行顺序拦截器配置
        Map<String,String> filtermap = new LinkedHashMap<>();

        filtermap.put("/sel/login", "anon");
        filtermap.put("index.html", "anon");
        filtermap.put("/css/**", "anon");
        filtermap.put("/layui/**", "anon");
        filtermap.put("/js/**", "anon");
        filtermap.put("/images/**", "anon");
        filtermap.put("*.png", "anon");
        filtermap.put("*jpg", "anon");

        //未认证都不允许通过
        filtermap.put("/**", "authc");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filtermap);
        //如果访问的页面未认证   跳转到登陆页面
        shiroFilterFactoryBean.setLoginUrl("/sel/toLogin");


        return shiroFilterFactoryBean;
    }

    //用来跟加密的密码进行比对的bean
    @Bean
    public HashedCredentialsMatcher getHashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        //设置比较规则
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        //迭代2次
        hashedCredentialsMatcher.setHashIterations(2);
        return hashedCredentialsMatcher;
    }
}
