package com.tsing.product.api.stroke.service.impl;

import com.tsing.product.api.stroke.entity.StrokeEntity;
import com.tsing.product.api.stroke.mapper.StrokeMapper;
import com.tsing.product.api.stroke.service.StrokeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <p>
 * 行程介绍 服务实现类
 * </p>
 *
 * @author dong.li
 * @since 2021-07-31
 */
@DubboService
public class StrokeServiceImpl extends ServiceImpl<StrokeMapper, StrokeEntity> implements StrokeService {

}
