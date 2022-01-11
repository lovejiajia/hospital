package com.aaa.entity;

import java.io.Serializable;

/**
 * (SysRoleUser)实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:13
 */
public class SysRoleUser implements Serializable {
    private static final long serialVersionUID = 949927004761702004L;
    
    private Integer uid;
    
    private Integer rid;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

}

