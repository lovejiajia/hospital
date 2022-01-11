package com.aaa.service.impl;

import com.aaa.service.SkullService;
import com.aaa.dao.SkullDao;
import com.aaa.entity.Skull;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Skull)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
@Service("skullService")
public class SkullServiceImpl implements SkullService {
    @Resource
    private SkullDao skullDao;

    /**
     * 通过ID查询单条数据
     *
     * @param skullid 主键
     * @return 实例对象
     */
    @Override
    public Skull queryById(Integer skullid) {
        return this.skullDao.queryById(skullid);
    }

    /**
     * 分页查询
     *
     * @param skull 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Skull> queryByPage(Skull skull, PageRequest pageRequest) {
        long total = this.skullDao.count(skull);
        return new PageImpl<>(this.skullDao.queryAllByLimit(skull, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param skull 实例对象
     * @return 实例对象
     */
    @Override
    public Skull insert(Skull skull) {
        this.skullDao.insert(skull);
        return skull;
    }

    /**
     * 修改数据
     *
     * @param skull 实例对象
     * @return 实例对象
     */
    @Override
    public Skull update(Skull skull) {
        this.skullDao.update(skull);
        return this.queryById(skull.getSkullid());
    }

    /**
     * 通过主键删除数据
     *
     * @param skullid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer skullid) {
        return this.skullDao.deleteById(skullid) > 0;
    }
}
