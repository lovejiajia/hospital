package com.aaa.dao;

import com.aaa.entity.Area;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Area)供应商
 *
 * @author makejava
 * @since 2022-01-12 13:29:09
 */
public interface AreaDao {
    int addArea(Area area);
    //有外键关联
    int deleteArea(int id);
    List<Area> queueListArea();
}

