package com.aaa.entity;

import java.io.Serializable;

/**
 * (Home)患者实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public class Home implements Serializable {
    private static final long serialVersionUID = 174568278802834124L;
    
    private Integer homeid;
    //患者姓名
    private String homename;
    //性别
    private String sex;
    //年龄
    private Integer age;
    //身份证
    private String carid;
    //电话
    private String phone;


    public Integer getHomeid() {
        return homeid;
    }

    public void setHomeid(Integer homeid) {
        this.homeid = homeid;
    }

    public String getHomename() {
        return homename;
    }

    public void setHomename(String homename) {
        this.homename = homename;
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

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}

