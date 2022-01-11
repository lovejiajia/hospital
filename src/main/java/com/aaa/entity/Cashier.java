package com.aaa.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Cashier)门诊收费实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public class Cashier implements Serializable {
    private static final long serialVersionUID = -23218038921174634L;
    //序号
    private Integer cashier;
    //挂号idForeign key
    private Integer reportid;
    //药品名称
    private String durgname;
    //次数
    private Integer durgnum;
    //单价
    private Object repiceprice;
    //小计
    private Object repicetotal;
    //价钱
    private Integer state;
    //创建日期
    private Date ctime;
    
    private Integer ostate;
    //状态描述
    private String jie;
    
    private Integer mstate;


    public Integer getCashier() {
        return cashier;
    }

    public void setCashier(Integer cashier) {
        this.cashier = cashier;
    }

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public String getJie() {
        return jie;
    }

    public void setJie(String jie) {
        this.jie = jie;
    }

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }

}

