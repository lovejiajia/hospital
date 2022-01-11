package com.aaa.entity;

import java.io.Serializable;

/**
 * (Registeredtype)挂号类型实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public class Registeredtype implements Serializable {
    private static final long serialVersionUID = 448423280082724571L;
    //序号
    private Integer registeredid;
    //挂号类型
    private String type;
    //挂号价格
    private Object price;


    public Integer getRegisteredid() {
        return registeredid;
    }

    public void setRegisteredid(Integer registeredid) {
        this.registeredid = registeredid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

}

