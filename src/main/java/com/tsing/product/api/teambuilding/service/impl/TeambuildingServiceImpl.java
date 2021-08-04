package com.tsing.product.api.teambuilding.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsing.global.result.ResultData;
import com.tsing.global.result.ResultPageData;
import com.tsing.product.api.teambuilding.bo.reponse.TeambuildingBoEntity;
import com.tsing.product.api.teambuilding.bo.request.TeambildingPage;
import com.tsing.product.api.teambuilding.bo.request.TeambuildingDeleteRequest;
import com.tsing.product.api.teambuilding.bo.request.TeambuildingSaveRequest;
import com.tsing.product.api.teambuilding.bo.request.TeambuildingUpdateRequest;
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
    public ResultData<ResultPageData<TeambuildingBoEntity>> pageList(TeambildingPage pageParam) {
        Page<TeambuildingEntity> pageEntity = teambuildingCommonService.pagingQuery(pageParam);
        return ResultData.success(teambuildingCommonService.coverTeambuildingPageEntityToBo(pageEntity));
    }

    @Override
    public ResultData<Boolean> modify(TeambuildingUpdateRequest param) {
        TeambuildingEntity entity = teambuildingCommonService.coverTeambuildingUpdateRequestToEntity(param);
        return ResultData.success(teambuildingCommonService.modify(entity));
    }

    @Override
    public ResultData<Boolean> delete(TeambuildingDeleteRequest param) {
        return ResultData.success(teambuildingCommonService.delete(param));
    }

    @Override
    public ResultData<Boolean> save(TeambuildingSaveRequest param) {
        TeambuildingEntity entity = teambuildingCommonService.coverTeambuildingSaveRequestToEntity(param);
        return ResultData.success(teambuildingCommonService.save(entity));
    }

}
