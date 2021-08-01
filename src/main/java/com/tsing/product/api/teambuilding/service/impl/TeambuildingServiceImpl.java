package com.tsing.product.api.teambuilding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsing.global.result.ResultData;
import com.tsing.product.api.teambuilding.bo.reponse.TeambuildingBoEntity;
import com.tsing.product.api.teambuilding.bo.request.TeambildingPage;
import com.tsing.product.api.teambuilding.common.TeambuildingCommonService;
import com.tsing.product.api.teambuilding.entity.TeambuildingEntity;
import com.tsing.product.api.teambuilding.mapper.TeambuildingMapper;
import com.tsing.product.api.teambuilding.service.TeambuildingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

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
    private TeambuildingCommonService teambuildingCommonService;

    @Override
    public ResultData<IPage<TeambuildingBoEntity>> pageList(TeambildingPage pageParam) {

        // 1、分页查询数据
        Page<TeambuildingEntity> pageEntity = teambuildingCommonService.pagingQuery(pageParam);
        // 2、转换对象

        IPage<TeambuildingBoEntity> teambuildingBoEntityPage = teambuildingCommonService.coverTeambuildingEntityToBo(pageEntity);
        return null;
    }

}
