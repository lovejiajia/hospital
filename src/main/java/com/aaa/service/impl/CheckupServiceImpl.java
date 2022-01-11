package com.aaa.service.impl;

import com.aaa.dao.CheckupDao;
import com.aaa.entity.Checkup;
import com.aaa.service.CheckupService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Checkup)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
@Service("checkupService")
public class CheckupServiceImpl implements CheckupService {
    @Resource
    private CheckupDao checkupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public Checkup queryById(Integer cid) {
        return this.checkupDao.queryById(cid);
    }

    /**
     * 分页查询
     *
     * @param checkup 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Checkup> queryByPage(Checkup checkup, PageRequest pageRequest) {
        long total = this.checkupDao.count(checkup);
        return new PageImpl<>(this.checkupDao.queryAllByLimit(checkup, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param checkup 实例对象
     * @return 实例对象
     */
    @Override
    public Checkup insert(Checkup checkup) {
        this.checkupDao.insert(checkup);
        return checkup;
    }

    /**
     * 修改数据
     *
     * @param checkup 实例对象
     * @return 实例对象
     */
    @Override
    public Checkup update(Checkup checkup) {
        this.checkupDao.update(checkup);
        return this.queryById(checkup.getCid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cid) {
        return this.checkupDao.deleteById(cid) > 0;
    }
}
