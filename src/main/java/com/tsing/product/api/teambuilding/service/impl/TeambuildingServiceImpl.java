package com.tsing.product.api.teambuilding.service.impl;

import com.tsing.product.api.teambuilding.entity.TeambuildingEntity;
import com.tsing.product.api.teambuilding.mapper.TeambuildingMapper;
import com.tsing.product.api.teambuilding.service.TeambuildingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <p>
 * 团建表 服务实现类
 * </p>
 *
 * @author dong.li
 * @since 2021-07-31
 */
@DubboService
public class TeambuildingServiceImpl extends ServiceImpl<TeambuildingMapper, TeambuildingEntity> implements TeambuildingService {

}
