package com.aaa.entity;

import java.io.Serializable;

/**
 * (Doctor)医生实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public class Doctor implements Serializable {
    private static final long serialVersionUID = -25075364032538054L;
    //序号
    private Integer doctorid;
    //医生名称
    private String doctorname;
    //所属科室
    private Integer departmentid;
    //挂号类型
    private Integer registeredid;
    //夏季0/冬季1
    private Integer dstate;
    //上午上班时间
    private String amstarttime;
    //上午下班时间
    private String amendtime;
    //下午上班时间
    private String pmstarttime;
    //下午下班时间
    private String pmendtime;


    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getRegisteredid() {
        return registeredid;
    }

    public void setRegisteredid(Integer registeredid) {
        this.registeredid = registeredid;
    }

    public Integer getDstate() {
        return dstate;
    }

    public void setDstate(Integer dstate) {
        this.dstate = dstate;
    }

    public String getAmstarttime() {
        return amstarttime;
    }

    public void setAmstarttime(String amstarttime) {
        this.amstarttime = amstarttime;
    }

    public String getAmendtime() {
        return amendtime;
    }

    public void setAmendtime(String amendtime) {
        this.amendtime = amendtime;
    }

    public String getPmstarttime() {
        return pmstarttime;
    }

    public void setPmstarttime(String pmstarttime) {
        this.pmstarttime = pmstarttime;
    }

    public String getPmendtime() {
        return pmendtime;
    }

    public void setPmendtime(String pmendtime) {
        this.pmendtime = pmendtime;
    }

}

