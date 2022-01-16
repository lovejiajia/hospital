package com.aaa.dao;

import com.aaa.entity.Report;

import java.util.Date;
import java.util.List;

/**
 * 门诊病人
 */
public interface ReportDao {
    int add(Report report);
    List<Report> select(Date date);
}
