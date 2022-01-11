package com.aaa.service;

import com.aaa.entity.Outpatienttype;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Outpatienttype)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public interface OutpatienttypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param outpatientid 主键
     * @return 实例对象
     */
    Outpatienttype queryById(Integer outpatientid);

    /**
     * 分页查询
     *
     * @param outpatienttype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Outpatienttype> queryByPage(Outpatienttype outpatienttype, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param outpatienttype 实例对象
     * @return 实例对象
     */
    Outpatienttype insert(Outpatienttype outpatienttype);

    /**
     * 修改数据
     *
     * @param outpatienttype 实例对象
     * @return 实例对象
     */
    Outpatienttype update(Outpatienttype outpatienttype);

    /**
     * 通过主键删除数据
     *
     * @param outpatientid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer outpatientid);

}
