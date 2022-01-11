package com.aaa.service;

import com.aaa.entity.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Doctor)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface DoctorService {

    /**
     * 通过ID查询单条数据
     *
     * @param doctorid 主键
     * @return 实例对象
     */
    Doctor queryById(Integer doctorid);

    /**
     * 分页查询
     *
     * @param doctor 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Doctor> queryByPage(Doctor doctor, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param doctor 实例对象
     * @return 实例对象
     */
    Doctor insert(Doctor doctor);

    /**
     * 修改数据
     *
     * @param doctor 实例对象
     * @return 实例对象
     */
    Doctor update(Doctor doctor);

    /**
     * 通过主键删除数据
     *
     * @param doctorid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer doctorid);

}
