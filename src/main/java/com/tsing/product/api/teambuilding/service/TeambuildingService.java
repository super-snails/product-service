package com.tsing.product.api.teambuilding.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsing.global.result.ResultData;
import com.tsing.product.api.teambuilding.bo.reponse.TeambuildingBoEntity;
import com.tsing.product.api.teambuilding.bo.request.TeambildingPage;
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

    ResultData<IPage<TeambuildingBoEntity>> pageList(TeambildingPage pageParam);

}
