package com.aaa.service.impl;

import com.aaa.dao.DoctorDao;
import com.aaa.entity.Doctor;
import com.aaa.service.DoctorService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Doctor)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
@Service("doctorService")
public class DoctorServiceImpl implements DoctorService {
    @Resource
    private DoctorDao doctorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param doctorid 主键
     * @return 实例对象
     */
    @Override
    public Doctor queryById(Integer doctorid) {
        return this.doctorDao.queryById(doctorid);
    }

    /**
     * 分页查询
     *
     * @param doctor 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Doctor> queryByPage(Doctor doctor, PageRequest pageRequest) {
        long total = this.doctorDao.count(doctor);
        return new PageImpl<>(this.doctorDao.queryAllByLimit(doctor, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param doctor 实例对象
     * @return 实例对象
     */
    @Override
    public Doctor insert(Doctor doctor) {
        this.doctorDao.insert(doctor);
        return doctor;
    }

    /**
     * 修改数据
     *
     * @param doctor 实例对象
     * @return 实例对象
     */
    @Override
    public Doctor update(Doctor doctor) {
        this.doctorDao.update(doctor);
        return this.queryById(doctor.getDoctorid());
    }

    /**
     * 通过主键删除数据
     *
     * @param doctorid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer doctorid) {
        return this.doctorDao.deleteById(doctorid) > 0;
    }
}
