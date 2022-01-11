package com.aaa.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Report)挂号实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public class Report implements Serializable {
    private static final long serialVersionUID = 845293867908863629L;
    //序号
    private Integer reportid;
    //姓名
    private String reportname;
    //性别
    private String sex;
    //年龄
    private Integer age;
    //科室fOREIGN key
    private Integer department;
    //医生fOREIGN key
    private Integer doctor;
    //挂号类别fOREIGN key
    private Integer reporttype;
    //挂号费
    private Object price;
    //时间
    private Date time;
    // 操作员
    private String users;
    //状态
    private Integer state;
    //电话
    private String phone;
    
    private String carid;
    //状态
    private String zhuan;


    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public String getReportname() {
        return reportname;
    }

    public void setReportname(String reportname) {
        this.reportname = reportname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getDoctor() {
        return doctor;
    }

    public void setDoctor(Integer doctor) {
        this.doctor = doctor;
    }

    public Integer getReporttype() {
        return reporttype;
    }

    public void setReporttype(Integer reporttype) {
        this.reporttype = reporttype;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan;
    }

}

