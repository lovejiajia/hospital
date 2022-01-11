package com.aaa.entity;

import java.io.Serializable;

/**
 * (Skull)经办人实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public class Skull implements Serializable {
    private static final long serialVersionUID = 313534580530015617L;
    //序号
    private Integer skullid;
    //经办人
    private String skullname;


    public Integer getSkullid() {
        return skullid;
    }

    public void setSkullid(Integer skullid) {
        this.skullid = skullid;
    }

    public String getSkullname() {
        return skullname;
    }

    public void setSkullname(String skullname) {
        this.skullname = skullname;
    }

}

