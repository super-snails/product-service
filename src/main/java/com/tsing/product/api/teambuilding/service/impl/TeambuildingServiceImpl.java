package com.tsing.product.api.teambuilding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsing.product.api.teambuilding.entity.TeambuildingEntity;
import com.tsing.product.api.teambuilding.mapper.TeambuildingMapper;
import com.tsing.product.api.teambuilding.service.TeambuildingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

import lombok.val;

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

    @Autowired
    private TeambuildingMapper teambuildingMapper;

    @Override
    public IPage<TeambuildingEntity> pageList() {

        Page<TeambuildingEntity> pageParam = new Page<>(1, 2);
        QueryWrapper<TeambuildingEntity> queryWrapper = new QueryWrapper<>();

        return teambuildingMapper.selectPage(pageParam, queryWrapper);
    }

}
