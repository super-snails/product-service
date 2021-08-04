package com.tsing.product.api.dict.service;import com.tsing.product.api.dict.bo.request.ProductDictSaveRequest;import com.tsing.product.api.dict.bo.request.ProductDictUpdateRequest;import org.junit.jupiter.api.Test;import org.springframework.boot.test.context.SpringBootTest;import javax.annotation.Resource;import lombok.val;@SpringBootTestpublic class ProductDictServiceTest {    @Resource    private ProductDictService productDictService;    @Test    public void testSave() {        ProductDictSaveRequest productDictSaveRequest = new ProductDictSaveRequest();        productDictSaveRequest.setCategoryCode("1000");        productDictSaveRequest.setCategoryDesc("分类描述");        productDictSaveRequest.setDictCode("1000");        productDictSaveRequest.setDictDesc("字典描述");        productDictSaveRequest.setSortNo(0);        productDictSaveRequest.setDataType("STRING");        final val save = productDictService.save(productDictSaveRequest);        System.out.println(save);    }    @Test    public void testModify() {        ProductDictUpdateRequest productDictUpdateRequest = new ProductDictUpdateRequest();        productDictUpdateRequest.setId(1423047691379372034L);        productDictUpdateRequest.setCategoryCode("1001");        productDictUpdateRequest.setCategoryDesc("分类描述");        productDictUpdateRequest.setDictCode("1001");        productDictUpdateRequest.setDictDesc("字典描述");        productDictUpdateRequest.setSortNo(0);        productDictUpdateRequest.setDataType("STRING");        final val modify = productDictService.modify(productDictUpdateRequest);        System.out.println(modify);    }}