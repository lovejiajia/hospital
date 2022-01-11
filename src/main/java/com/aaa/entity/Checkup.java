package com.aaa.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Checkup)实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public class Checkup implements Serializable {
    private static final long serialVersionUID = 937412787967711102L;
    
    private Integer cid;
    
    private Integer registerid;
    
    private String content;
    
    private Date ctime;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

}

