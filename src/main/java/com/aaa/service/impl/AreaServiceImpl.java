package com.aaa.service.impl;

import com.aaa.entity.Area;
import com.aaa.dao.AreaDao;
import com.aaa.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Area)表服务实现类
 *
 * @author makejava
 * @since 2022-01-12 13:29:10
 */
@Service("areaService")
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaDao areaDao;

    @Override
    public int addArea(Area area) {
        return areaDao.addArea(area);
    }

    @Override
    public int deleteArea(int id) {
        return areaDao.deleteArea(id);
    }

    @Override
    public List<Area> queueListArea() {
        return areaDao.queueListArea();
    }
}
