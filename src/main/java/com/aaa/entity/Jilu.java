package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Jilu)仓库出库记录实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public class Jilu implements Serializable {
    private static final long serialVersionUID = -89125653850339349L;
    //序号
    private Integer jiluid;
    //药品名称
    private String jiluname;
    //时间
    private Date jilutime;
    //类型（卖出、过期）
    private String jilutype;
    //记录需求地
    private String jilupeople;
    //
    private Integer jilunumber;
    //记录批号
    private String jilupihao;


    public Integer getJiluid() {
        return jiluid;
    }

    public void setJiluid(Integer jiluid) {
        this.jiluid = jiluid;
    }

    public String getJiluname() {
        return jiluname;
    }

    public void setJiluname(String jiluname) {
        this.jiluname = jiluname;
    }

    public Date getJilutime() {
        return jilutime;
    }

    public void setJilutime(Date jilutime) {
        this.jilutime = jilutime;
    }

    public String getJilutype() {
        return jilutype;
    }

    public void setJilutype(String jilutype) {
        this.jilutype = jilutype;
    }

    public String getJilupeople() {
        return jilupeople;
    }

    public void setJilupeople(String jilupeople) {
        this.jilupeople = jilupeople;
    }

    public Integer getJilunumber() {
        return jilunumber;
    }

    public void setJilunumber(Integer jilunumber) {
        this.jilunumber = jilunumber;
    }

    public String getJilupihao() {
        return jilupihao;
    }

    public void setJilupihao(String jilupihao) {
        this.jilupihao = jilupihao;
    }

}

