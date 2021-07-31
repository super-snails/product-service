package com.tsing.product.config;import com.baomidou.mybatisplus.annotation.DbType;import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;import org.mybatis.spring.annotation.MapperScan;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;/** * myBatis Plus 配置文件 * @author Tsing * @Date 2021/7/31 */@Configuration@MapperScan(value = {"com.tsing.product.api.*.mapper"})public class MybatisPlusConfig {    /**     * @return mybatisPlusInterceptor mybatis插件     * @Description 插件     * @author Tsing     * @Date 2021/5/2     */    @Bean    public MybatisPlusInterceptor mybatisPlusInterceptor() {        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));        return interceptor;    }}