package com.tsing.product.api.feature.service.impl;

import com.tsing.product.api.feature.entity.FeatureEntity;
import com.tsing.product.api.feature.mapper.FeatureMapper;
import com.tsing.product.api.feature.service.FeatureService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <p>
 * 团建特色 服务实现类
 * </p>
 *
 * @author dong.li
 * @since 2021-07-31
 */
@DubboService
public class FeatureServiceImpl extends ServiceImpl<FeatureMapper, FeatureEntity> implements FeatureService {

}
