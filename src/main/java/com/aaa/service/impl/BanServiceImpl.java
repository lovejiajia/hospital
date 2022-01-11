package com.aaa.service.impl;

import com.aaa.entity.Ban;
import com.aaa.dao.BanDao;
import com.aaa.service.BanService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Ban)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
@Service("banService")
public class BanServiceImpl implements BanService {
    @Resource
    private BanDao banDao;

    /**
     * 新增数据
     *
     * @param ban 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Ban ban) {
        return banDao.insert(ban);
    }

    /**
     * 通过主键删除数据
     *
     * @param bid 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer bid) {
        return banDao.deleteById(bid);
    }
}
