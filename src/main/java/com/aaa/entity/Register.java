package com.aaa.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Register)住院登记实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public class Register implements Serializable {
    private static final long serialVersionUID = -86798219586322131L;
    //序号
    private Integer registerid;
    //患者名字
    private String username;
    //年龄
    private Integer age;
    //性别
    private String sex;
    //科室 FOREIGN
    private Integer department;
    //医生
    private Integer doctor;
    //入院诊断
    private String diagnose;
    //地址
    private String address;
    //电话
    private String phone;
    //身份证号
    private String idcard;
    //入院日期
    private Date registerdate;
    //床号FOREIGN
    private Integer bednum;
    //操作员
    private String operator;
    //预交金
    private Object money;
    //状态
    private Integer state;
    //出院日期
    private Date enddate;
    //总价格
    private Object price;
    //优惠比例
    private String discount;
    //转院日期
    private Date zhuan;


    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public Integer getBednum() {
        return bednum;
    }

    public void setBednum(Integer bednum) {
        this.bednum = bednum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Object getMoney() {
        return money;
    }

    public void setMoney(Object money) {
        this.money = money;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Date getZhuan() {
        return zhuan;
    }

    public void setZhuan(Date zhuan) {
        this.zhuan = zhuan;
    }

}

