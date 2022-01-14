package com.aaa.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2022-01-12 17:42:44
 */
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = 959912825972863296L;
    
    private Integer userid;
    
    private String loginname;
    
    private String identity;
    
    private String realname;
    /**
     * 0女1男
     */
    private Integer sex;
    
    private String address;
    
    private String phone;
    
    private String pwd;
    
    private String position;
    /**
     * 1，超级管理员,2，系统用户
     */
    private Integer type;
    
    private Integer available;
    
    private String salt;


}

