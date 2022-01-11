package com.aaa.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Pay)预交金实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public class Pay implements Serializable {
    private static final long serialVersionUID = 964961190361664824L;
    //序号
    private Integer payid;
    //住院id
    private Integer registerid;
    //交款
    private Object money;
    //缴款日期
    private Date paydate;


    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public Object getMoney() {
        return money;
    }

    public void setMoney(Object money) {
        this.money = money;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

}

