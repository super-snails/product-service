package com.tsing.product.api.teambuilding.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsing.product.api.teambuilding.entity.TeambuildingEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 团建表 服务类
 * </p>
 *
 * @author dong.li
 * @since 2021-07-31
 */
public interface TeambuildingService extends IService<TeambuildingEntity> {

    IPage<TeambuildingEntity> pageList();

}
