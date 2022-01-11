package com.aaa.service;

import com.aaa.entity.Inoutpatienttype;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Inoutpatienttype)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public interface InoutpatienttypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param inoutpatientid 主键
     * @return 实例对象
     */
    Inoutpatienttype queryById(Integer inoutpatientid);

    /**
     * 分页查询
     *
     * @param inoutpatienttype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Inoutpatienttype> queryByPage(Inoutpatienttype inoutpatienttype, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param inoutpatienttype 实例对象
     * @return 实例对象
     */
    Inoutpatienttype insert(Inoutpatienttype inoutpatienttype);

    /**
     * 修改数据
     *
     * @param inoutpatienttype 实例对象
     * @return 实例对象
     */
    Inoutpatienttype update(Inoutpatienttype inoutpatienttype);

    /**
     * 通过主键删除数据
     *
     * @param inoutpatientid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer inoutpatientid);

}
