package com.aaa.service.impl;

import com.aaa.dao.DrugstoreDao;
import com.aaa.entity.Drugstore;
import com.aaa.service.DrugstoreService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Drugstore)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
@Service("drugstoreService")
public class DrugstoreServiceImpl implements DrugstoreService {
    @Resource
    private DrugstoreDao drugstoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rugstoreid 主键
     * @return 实例对象
     */
    @Override
    public Drugstore queryById(Integer rugstoreid) {
        return this.drugstoreDao.queryById(rugstoreid);
    }

    /**
     * 分页查询
     *
     * @param drugstore 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Drugstore> queryByPage(Drugstore drugstore, PageRequest pageRequest) {
        long total = this.drugstoreDao.count(drugstore);
        return new PageImpl<>(this.drugstoreDao.queryAllByLimit(drugstore, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param drugstore 实例对象
     * @return 实例对象
     */
    @Override
    public Drugstore insert(Drugstore drugstore) {
        this.drugstoreDao.insert(drugstore);
        return drugstore;
    }

    /**
     * 修改数据
     *
     * @param drugstore 实例对象
     * @return 实例对象
     */
    @Override
    public Drugstore update(Drugstore drugstore) {
        this.drugstoreDao.update(drugstore);
        return this.queryById(drugstore.getRugstoreid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rugstoreid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rugstoreid) {
        return this.drugstoreDao.deleteById(rugstoreid) > 0;
    }
}
