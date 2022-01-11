package com.aaa.entity;

import java.io.Serializable;

/**
 * (Caigou)采购实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public class Caigou implements Serializable {
    private static final long serialVersionUID = 985595270749899004L;
    
    private Integer caigouid;
    //药品名称
    private String caigouname;
    //供货商
    private String gonghuoshang;
    //单位
    private String danwei;
    //产地
    private String candi;
    //类型（中药、、西药）
    private String leixing;
    //数量
    private Integer shuliang;


    public Integer getCaigouid() {
        return caigouid;
    }

    public void setCaigouid(Integer caigouid) {
        this.caigouid = caigouid;
    }

    public String getCaigouname() {
        return caigouname;
    }

    public void setCaigouname(String caigouname) {
        this.caigouname = caigouname;
    }

    public String getGonghuoshang() {
        return gonghuoshang;
    }

    public void setGonghuoshang(String gonghuoshang) {
        this.gonghuoshang = gonghuoshang;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public String getCandi() {
        return candi;
    }

    public void setCandi(String candi) {
        this.candi = candi;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public Integer getShuliang() {
        return shuliang;
    }

    public void setShuliang(Integer shuliang) {
        this.shuliang = shuliang;
    }

}

