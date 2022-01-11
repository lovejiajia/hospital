package com.aaa.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Hospitalprice)住院收费实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public class Hospitalprice implements Serializable {
    private static final long serialVersionUID = -80931634440731018L;
    //序号
    private Integer hospitalpriceid;
    //住院idForeign key
    private Integer registerid;
    //名称
    private String durgname;
    //数量
    private Integer durgnum;
    //价格
    private Object repiceprice;
    //小计
    private Object repicetotal;
    //日期
    private Date htime;
    //药品还是收费项目
    private Integer state;


    public Integer getHospitalpriceid() {
        return hospitalpriceid;
    }

    public void setHospitalpriceid(Integer hospitalpriceid) {
        this.hospitalpriceid = hospitalpriceid;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public String getDurgname() {
        return durgname;
    }

    public void setDurgname(String durgname) {
        this.durgname = durgname;
    }

    public Integer getDurgnum() {
        return durgnum;
    }

    public void setDurgnum(Integer durgnum) {
        this.durgnum = durgnum;
    }

    public Object getRepiceprice() {
        return repiceprice;
    }

    public void setRepiceprice(Object repiceprice) {
        this.repiceprice = repiceprice;
    }

    public Object getRepicetotal() {
        return repicetotal;
    }

    public void setRepicetotal(Object repicetotal) {
        this.repicetotal = repicetotal;
    }

    public Date getHtime() {
        return htime;
    }

    public void setHtime(Date htime) {
        this.htime = htime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}

