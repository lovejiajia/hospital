package com.aaa.entity;

import java.io.Serializable;

/**
 * (Ban)有班无班实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
public class Ban implements Serializable {
    private static final long serialVersionUID = 989660000348423950L;
    
    private Integer bid;
    
    private String bname;


    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

}

