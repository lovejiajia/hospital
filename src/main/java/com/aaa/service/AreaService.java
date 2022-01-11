package com.aaa.service;

import com.aaa.entity.Area;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Area)地区的增删改查
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
public interface AreaService {

    Area queryById(Integer areaid);
    List<Area> queryList(Area area);
    int insert(Area area);
    int update(Area area);
    int deleteById(Integer areaid);


}
