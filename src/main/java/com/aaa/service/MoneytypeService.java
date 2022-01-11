package com.aaa.service;

import com.aaa.entity.Moneytype;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Moneytype)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public interface MoneytypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param moneyid 主键
     * @return 实例对象
     */
    Moneytype queryById(Integer moneyid);

    /**
     * 分页查询
     *
     * @param moneytype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Moneytype> queryByPage(Moneytype moneytype, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param moneytype 实例对象
     * @return 实例对象
     */
    Moneytype insert(Moneytype moneytype);

    /**
     * 修改数据
     *
     * @param moneytype 实例对象
     * @return 实例对象
     */
    Moneytype update(Moneytype moneytype);

    /**
     * 通过主键删除数据
     *
     * @param moneyid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer moneyid);

}
