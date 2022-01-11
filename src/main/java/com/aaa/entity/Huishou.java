package com.aaa.entity;

import java.io.Serializable;

/**
 * (Huishou)药品回收实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public class Huishou implements Serializable {
    private static final long serialVersionUID = -46625191159270024L;
    //序号
    private Integer huishouid;
    //回收药品
    private String huishouname;
    //
    private Integer huishounumber;
    //回收票据
    private String huishoupihao;
    //回收地址（门诊、住院）
    private String jbr;
    //备注
    private String beizhu;


    public Integer getHuishouid() {
        return huishouid;
    }

    public void setHuishouid(Integer huishouid) {
        this.huishouid = huishouid;
    }

    public String getHuishouname() {
        return huishouname;
    }

    public void setHuishouname(String huishouname) {
        this.huishouname = huishouname;
    }

    public Integer getHuishounumber() {
        return huishounumber;
    }

    public void setHuishounumber(Integer huishounumber) {
        this.huishounumber = huishounumber;
    }

    public String getHuishoupihao() {
        return huishoupihao;
    }

    public void setHuishoupihao(String huishoupihao) {
        this.huishoupihao = huishoupihao;
    }

    public String getJbr() {
        return jbr;
    }

    public void setJbr(String jbr) {
        this.jbr = jbr;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

}

