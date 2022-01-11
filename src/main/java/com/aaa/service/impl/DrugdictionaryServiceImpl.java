package com.aaa.service.impl;

import com.aaa.entity.Drugdictionary;
import com.aaa.dao.DrugdictionaryDao;
import com.aaa.service.DrugdictionaryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Drugdictionary)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
@Service("drugdictionaryService")
public class DrugdictionaryServiceImpl implements DrugdictionaryService {
    @Resource
    private DrugdictionaryDao drugdictionaryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param drugid 主键
     * @return 实例对象
     */
    @Override
    public Drugdictionary queryById(Integer drugid) {
        return this.drugdictionaryDao.queryById(drugid);
    }

    /**
     * 分页查询
     *
     * @param drugdictionary 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Drugdictionary> queryByPage(Drugdictionary drugdictionary, PageRequest pageRequest) {
        long total = this.drugdictionaryDao.count(drugdictionary);
        return new PageImpl<>(this.drugdictionaryDao.queryAllByLimit(drugdictionary, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param drugdictionary 实例对象
     * @return 实例对象
     */
    @Override
    public Drugdictionary insert(Drugdictionary drugdictionary) {
        this.drugdictionaryDao.insert(drugdictionary);
        return drugdictionary;
    }

    /**
     * 修改数据
     *
     * @param drugdictionary 实例对象
     * @return 实例对象
     */
    @Override
    public Drugdictionary update(Drugdictionary drugdictionary) {
        this.drugdictionaryDao.update(drugdictionary);
        return this.queryById(drugdictionary.getDrugid());
    }

    /**
     * 通过主键删除数据
     *
     * @param drugid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer drugid) {
        return this.drugdictionaryDao.deleteById(drugid) > 0;
    }
}
