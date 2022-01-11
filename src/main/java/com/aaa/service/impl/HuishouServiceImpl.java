package com.aaa.service.impl;

import com.aaa.entity.Huishou;
import com.aaa.service.HuishouService;
import com.aaa.dao.HuishouDao;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Huishou)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
@Service("huishouService")
public class HuishouServiceImpl implements HuishouService {
    @Resource
    private HuishouDao huishouDao;

    /**
     * 通过ID查询单条数据
     *
     * @param huishouid 主键
     * @return 实例对象
     */
    @Override
    public Huishou queryById(Integer huishouid) {
        return this.huishouDao.queryById(huishouid);
    }

    /**
     * 分页查询
     *
     * @param huishou 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Huishou> queryByPage(Huishou huishou, PageRequest pageRequest) {
        long total = this.huishouDao.count(huishou);
        return new PageImpl<>(this.huishouDao.queryAllByLimit(huishou, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param huishou 实例对象
     * @return 实例对象
     */
    @Override
    public Huishou insert(Huishou huishou) {
        this.huishouDao.insert(huishou);
        return huishou;
    }

    /**
     * 修改数据
     *
     * @param huishou 实例对象
     * @return 实例对象
     */
    @Override
    public Huishou update(Huishou huishou) {
        this.huishouDao.update(huishou);
        return this.queryById(huishou.getHuishouid());
    }

    /**
     * 通过主键删除数据
     *
     * @param huishouid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer huishouid) {
        return this.huishouDao.deleteById(huishouid) > 0;
    }
}
