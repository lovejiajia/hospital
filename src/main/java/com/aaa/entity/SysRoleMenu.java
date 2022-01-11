package com.aaa.entity;

import java.io.Serializable;

/**
 * (SysRoleMenu)实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public class SysRoleMenu implements Serializable {
    private static final long serialVersionUID = -94507104525065994L;
    
    private Integer rid;
    
    private Integer mid;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

}

