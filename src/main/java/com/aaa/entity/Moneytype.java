package com.aaa.entity;

import java.io.Serializable;

/**
 * (Moneytype)收费比例实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public class Moneytype implements Serializable {
    private static final long serialVersionUID = -21193978393294437L;
    //序号
    private Integer moneyid;
    //收费类型
    private String moneytype;
    //比例
    private String percent;


    public Integer getMoneyid() {
        return moneyid;
    }

    public void setMoneyid(Integer moneyid) {
        this.moneyid = moneyid;
    }

    public String getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(String moneytype) {
        this.moneytype = moneytype;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

}

