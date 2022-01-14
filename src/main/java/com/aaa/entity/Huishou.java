package com.aaa.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Huishou)药品过期回收
 *
 * @author makejava
 * @since 2022-01-14 17:15:40
 */
@Data
public class Huishou {
    private Integer huishouid;
    private String huishouname;
    private Integer huishounumber;
    private String huishoupihao;
    private String jbr;
    private String beizhu;

}

