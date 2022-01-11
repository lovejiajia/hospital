package com.aaa.entity;

import java.io.Serializable;

/**
 * (Type)药品类型实体类(中药、西药)
 *
 * @author makejava
 * @since 2022-01-10 17:47:13
 */
public class Type implements Serializable {
    private static final long serialVersionUID = -56689753362344637L;
    //序号
    private Integer typeid;
    //药品类型
    private String typename;


    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

}

