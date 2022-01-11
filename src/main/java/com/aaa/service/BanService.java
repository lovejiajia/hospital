package com.aaa.service;

import com.aaa.entity.Ban;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Ban)有班无班
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
public interface BanService {

    int insert(Ban ban);
    int deleteById(Integer bid);

}
