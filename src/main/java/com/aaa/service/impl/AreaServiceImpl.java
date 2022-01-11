package com.aaa.service.impl;

import com.aaa.dao.AreaDao;
import com.aaa.entity.Area;
import com.aaa.service.AreaService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Area)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
@Service("areaService")
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaDao areaDao;

    @Override
    public Area queryById(Integer areaid) {
        return areaDao.queryById(areaid);
    }

    @Override
    public List<Area> queryList(Area area) {
        return areaDao.queryList(area);
    }

    @Override
    public int insert(Area area) {
        return areaDao.insert(area);
    }

    @Override
    public int update(Area area) {
        return areaDao.update(area);
    }

    @Override
    public int deleteById(Integer areaid) {
        return areaDao.deleteById(areaid);
    }
}
