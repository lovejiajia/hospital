package com.aaa.service.impl;

import com.aaa.dao.HomeDao;
import com.aaa.entity.Home;
import com.aaa.service.HomeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Home)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
@Service("homeService")
public class HomeServiceImpl implements HomeService {
    @Resource
    private HomeDao homeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param homeid 主键
     * @return 实例对象
     */
    @Override
    public Home queryById(Integer homeid) {
        return this.homeDao.queryById(homeid);
    }

    /**
     * 分页查询
     *
     * @param home 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Home> queryByPage(Home home, PageRequest pageRequest) {
        long total = this.homeDao.count(home);
        return new PageImpl<>(this.homeDao.queryAllByLimit(home, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param home 实例对象
     * @return 实例对象
     */
    @Override
    public Home insert(Home home) {
        this.homeDao.insert(home);
        return home;
    }

    /**
     * 修改数据
     *
     * @param home 实例对象
     * @return 实例对象
     */
    @Override
    public Home update(Home home) {
        this.homeDao.update(home);
        return this.queryById(home.getHomeid());
    }

    /**
     * 通过主键删除数据
     *
     * @param homeid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer homeid) {
        return this.homeDao.deleteById(homeid) > 0;
    }
}
