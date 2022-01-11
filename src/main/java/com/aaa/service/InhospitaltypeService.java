package com.aaa.service;

import com.aaa.entity.Inhospitaltype;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Inhospitaltype)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public interface InhospitaltypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param inhospitalid 主键
     * @return 实例对象
     */
    Inhospitaltype queryById(Integer inhospitalid);

    /**
     * 分页查询
     *
     * @param inhospitaltype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Inhospitaltype> queryByPage(Inhospitaltype inhospitaltype, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param inhospitaltype 实例对象
     * @return 实例对象
     */
    Inhospitaltype insert(Inhospitaltype inhospitaltype);

    /**
     * 修改数据
     *
     * @param inhospitaltype 实例对象
     * @return 实例对象
     */
    Inhospitaltype update(Inhospitaltype inhospitaltype);

    /**
     * 通过主键删除数据
     *
     * @param inhospitalid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer inhospitalid);

}
