package com.aaa.entity;

import java.io.Serializable;

/**
 * (SysRole)用户权限实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = 757885079831806550L;
    
    private Integer roleid;
    //用户名称
    private String rolename;
    //权限
    private String roledesc;
    
    private Integer available;


    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

}

