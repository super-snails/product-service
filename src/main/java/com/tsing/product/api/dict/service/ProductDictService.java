package com.tsing.product.api.dict.service;

import com.tsing.global.result.ResultData;
import com.tsing.global.result.ResultPageData;
import com.tsing.product.api.dict.bo.reponse.ProductDictPageReponse;
import com.tsing.product.api.dict.bo.request.ProductDictSaveRequest;
import com.tsing.product.api.dict.bo.request.ProductDictUpdateRequest;
import com.tsing.product.api.dict.entity.ProductDictEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 产品通用数据字典 服务类
 * </p>
 *
 * @author dong.li
 * @since 2021-08-04
 */
public interface ProductDictService extends IService<ProductDictEntity> {

    /**
     * 保存产品字典信息
     * @Date 2021/8/5 7:23 下午
     * @author Tsing
     * @param param 参数
     * @return boolean false 失败 true 保存成功
     */
    ResultData<Boolean> save(ProductDictSaveRequest param);

    /**
     * 修改产品字典信息
     * @Date 2021/8/5 7:23 下午
     * @author Tsing
     * @param param 参数
     * @return boolean false 失败 true 保存成功
     */
    ResultData<Boolean> modify(ProductDictUpdateRequest param);

    /**
     * 分页查询产品字典信息
     * @Date 2021/8/5 7:23 下午
     * @author Tsing
     * @param categoryCode 分类编码 dictCode 字典编码
     * @return ProductDictPageReponse 产品字典信息
     */
    ResultData<ResultPageData<ProductDictPageReponse>> pageList(String categoryCode, String dictCode) throws Exception;
}
