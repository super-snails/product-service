package com.tsing.product.api.dict.service.impl;

import com.tsing.global.result.ResultData;
import com.tsing.product.api.dict.bo.request.ProductDictSaveRequest;
import com.tsing.product.api.dict.bo.request.ProductDictUpdateRequest;
import com.tsing.product.api.dict.common.ProductDictCommonService;
import com.tsing.product.api.dict.entity.ProductDictEntity;
import com.tsing.product.api.dict.mapper.ProductDictMapper;
import com.tsing.product.api.dict.service.ProductDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * <p>
 * 产品通用数据字典 服务实现类
 * </p>
 *
 * @author dong.li
 * @since 2021-08-04
 */
@DubboService
public class ProductDictServiceImpl extends ServiceImpl<ProductDictMapper, ProductDictEntity> implements ProductDictService {

    @Resource
    private ProductDictCommonService productDictCommonService;

    @Override
    public ResultData<Boolean> save(ProductDictSaveRequest param) {
        ProductDictEntity entity = productDictCommonService.coverProductDictSaveRequestToEntity(param);
        return ResultData.success(productDictCommonService.save(entity));
    }

    @Override
    public ResultData<Boolean> modify(ProductDictUpdateRequest param) {
        ProductDictEntity entity = productDictCommonService.coverProductDictUpdateRequestToEntity(param);
        return ResultData.success(productDictCommonService.modify(entity));
    }
}
