package com.tsing.product.api.service;import org.junit.jupiter.api.Test;import org.springframework.boot.test.context.SpringBootTest;import javax.annotation.Resource;/** * @author Tsing * @version 0.0.1 * @date 2021/7/31 4:19 上午 * @description: 单元测试测试服务 */@SpringBootTestpublic class DemoServiceTest {    @Resource    private DemoService demoService;    @Test    public void testCheckHealth() {        String result = demoService.checkHealth();        System.out.println(result);    }}