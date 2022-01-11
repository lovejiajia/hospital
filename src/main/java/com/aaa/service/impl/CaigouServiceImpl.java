package com.aaa.service.impl;

import com.aaa.dao.CaigouDao;
import com.aaa.entity.Caigou;
import com.aaa.service.CaigouService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Caigou)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
@Service("caigouService")
public class CaigouServiceImpl implements CaigouService {
    @Resource
    private CaigouDao caigouDao;

    /**
     * 通过ID查询单条数据
     *
     * @param caigouid 主键
     * @return 实例对象
     */
    @Override
    public Caigou queryById(Integer caigouid) {
        return this.caigouDao.queryById(caigouid);
    }

    /**
     * 分页查询
     *
     * @param caigou 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Caigou> queryByPage(Caigou caigou, PageRequest pageRequest) {
        long total = this.caigouDao.count(caigou);
        return new PageImpl<>(this.caigouDao.queryAllByLimit(caigou, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param caigou 实例对象
     * @return 实例对象
     */
    @Override
    public Caigou insert(Caigou caigou) {
        this.caigouDao.insert(caigou);
        return caigou;
    }

    /**
     * 修改数据
     *
     * @param caigou 实例对象
     * @return 实例对象
     */
    @Override
    public Caigou update(Caigou caigou) {
        this.caigouDao.update(caigou);
        return this.queryById(caigou.getCaigouid());
    }

    /**
     * 通过主键删除数据
     *
     * @param caigouid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer caigouid) {
        return this.caigouDao.deleteById(caigouid) > 0;
    }
}
