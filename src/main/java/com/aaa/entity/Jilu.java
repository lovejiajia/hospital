package com.aaa.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Jilu)药品出药房记录
 *
 * @author makejava
 * @since 2022-01-14 17:31:23
 */
@Data
public class Jilu {
    private Integer jiluid;
    private String jiluname;
    private Date jilutime;
    private String jilutype;
    private String jilupeople;
    private Integer jilunumber;
    private String jilupihao;
}

