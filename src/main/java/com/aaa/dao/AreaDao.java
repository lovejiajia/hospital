package com.aaa.dao;

import com.aaa.entity.Area;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Area)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
public interface AreaDao {

    Area queryById(Integer areaid);
    List<Area> queryList(Area area);
    int insert(Area area);
    int update(Area area);
    int deleteById(Integer areaid);

}

