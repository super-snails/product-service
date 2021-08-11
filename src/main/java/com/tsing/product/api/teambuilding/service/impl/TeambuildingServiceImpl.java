package com.tsing.product.api.teambuilding.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsing.global.result.ResultData;
import com.tsing.global.result.ResultPageData;
import com.tsing.product.api.feature.entity.FeatureEntity;
import com.tsing.product.api.stroke.entity.StrokeEntity;
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

import java.util.List;

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

        // 团建基本信息
        TeambuildingEntity entity = teambuildingCommonService.coverTeambuildingSaveRequestToEntity(param);
        Boolean teambuildingSaveStatus = teambuildingCommonService.save(entity);

        // 特色信息
        FeatureEntity featureEntity = teambuildingCommonService.coverFeatureSaveRequest(param.getFeature());
        featureEntity.setTeambuildingId(entity.getId());
        Boolean featureEntitySaveStatus = teambuildingCommonService.saveFeatureEntity(featureEntity);

        // 行程信息
        List<StrokeEntity> strokeEntityList = teambuildingCommonService.coverStorkeSaveRequest(param.getStorkeList());
        Boolean strokeEntitySaveStatus = teambuildingCommonService.saveStorkeEntity(strokeEntityList, entity.getId());
        return ResultData.success(teambuildingSaveStatus || featureEntitySaveStatus);
    }

}
