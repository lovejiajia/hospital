package com.aaa.service;

import com.aaa.entity.Area;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Area)表服务接口
 *
 * @author makejava
 * @since 2022-01-12 13:29:10
 */
public interface AreaService {
    int addArea(Area area);
    int deleteArea(int id);
    List<Area> queueListArea();
}
