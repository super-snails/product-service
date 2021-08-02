package com.tsing.product.api.teambuilding.service;

import com.tsing.global.result.ResultData;
import com.tsing.global.result.ResultPageData;
import com.tsing.product.api.teambuilding.bo.reponse.TeambuildingBoEntity;
import com.tsing.product.api.teambuilding.bo.request.TeambildingPage;
import com.tsing.product.api.teambuilding.bo.request.TeambuildingDeleteRequest;
import com.tsing.product.api.teambuilding.bo.request.TeambuildingUpdateRequest;
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

    /**
     * 分页获取团建游产品列表
     * @Date 2021/8/1 7:00 下午
     * @author Tsing
     * @param pageParam 查询条件
     * @return 团建游信息
     */
    ResultData<ResultPageData<TeambuildingBoEntity>> pageList(TeambildingPage pageParam);

    /**
     * 团建游修改信息
     * @Date 2021/8/1 7:01 下午
     * @author Tsing
     * @param param 团建游修改信息
     * @return boolean false 修改失败 true 修改成功
     */
    ResultData<Boolean> modify(TeambuildingUpdateRequest param);

    /**
     * 删除团建游信息
     * @Date 2021/8/1 7:23 下午
     * @author Tsing
     * @param param 参数
     * @return boolean false 删除失败 true 删除成功
     */
    ResultData<Boolean> delete(TeambuildingDeleteRequest param);
}
