package com.tsing.product.api.demo.service.impl;

import com.tsing.product.api.demo.entity.DemoEntity;
import com.tsing.product.api.demo.mapper.DemoMapper;
import com.tsing.product.api.demo.service.DemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务状态检查 服务实现类
 * </p>
 *
 * @author dong.li
 * @since 2021-07-31
 */
@DubboService
public class DemoServiceImpl extends ServiceImpl<DemoMapper, DemoEntity> implements DemoService {

}
