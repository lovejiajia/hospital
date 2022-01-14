package com.aaa.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Inoutpatienttype)手术价格
 *
 * @author makejava
 * @since 2022-01-14 17:19:38
 */
@Data
public class Inoutpatienttype {
    private Integer inoutpatientid;
    private String projectname;
    private Unit unit;
    private Projecttype bigprojectid;
    private Double price;

}

