package com.tsing.product.utils;import com.baomidou.mybatisplus.annotation.DbType;import com.baomidou.mybatisplus.core.toolkit.StringPool;import com.baomidou.mybatisplus.generator.AutoGenerator;import com.baomidou.mybatisplus.generator.InjectionConfig;import com.baomidou.mybatisplus.generator.config.DataSourceConfig;import com.baomidou.mybatisplus.generator.config.FileOutConfig;import com.baomidou.mybatisplus.generator.config.GlobalConfig;import com.baomidou.mybatisplus.generator.config.PackageConfig;import com.baomidou.mybatisplus.generator.config.StrategyConfig;import com.baomidou.mybatisplus.generator.config.TemplateConfig;import com.baomidou.mybatisplus.generator.config.po.TableInfo;import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;import java.util.ArrayList;import java.util.List;/** * @author Tsing * @version 0.0.1 * @date 2021/5/3 12:01 上午 * @description: */public class CodeGenerator {    public static void main(String[] args) {        String tableName = "demo";        String packageName = "demo";        Boolean fileOverride = false;        AutoGenerator mpg = new AutoGenerator();        GlobalConfig gc = getGlobalConfig(fileOverride);        mpg.setGlobalConfig(gc);        DataSourceConfig dsc = getDataSourceConfig();        mpg.setDataSource(dsc);        PackageConfig pc = getPackageConfig(packageName);        mpg.setPackageInfo(pc);        StrategyConfig strategyConfig = getStrategyConfig(tableName);        mpg.setStrategy(strategyConfig);        InjectionConfig injectionConfig = getInjectionConfig();        // 如果模板引擎是 velocity         String templatePath = "/templates/mapper.xml.vm";        // 自定义输出配置        List<FileOutConfig> focList = new ArrayList<>();        // 自定义配置会被优先输出        String projectPath = System.getProperty("user.dir");        focList.add(new FileOutConfig(templatePath) {            @Override            public String outputFile(TableInfo tableInfo) {                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！                return projectPath + "/src/main/resources/mapper/"                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;            }        });        injectionConfig.setFileOutConfigList(focList);        mpg.setCfg(injectionConfig);        TemplateConfig templateConfig = new TemplateConfig();        templateConfig.setController("");        templateConfig.setXml(null);        mpg.setTemplate(templateConfig);        mpg.execute();    }    /**     * @Description 策略配置     * @author Tsing     * @Date 2021/5/3 strategy.setInclude("user_info"); strategy.setControllerMappingHyphenStyle(true);     * strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");     * strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");strategy.setSuperEntityColumns("id");     */    public static StrategyConfig getStrategyConfig(String tableName) {        StrategyConfig strategy = new StrategyConfig();        strategy.setNaming(NamingStrategy.underline_to_camel);        strategy.setColumnNaming(NamingStrategy.underline_to_camel);        strategy.setEntityLombokModel(true);        strategy.setRestControllerStyle(false);        strategy.setInclude(tableName);        return strategy;    }    /**     * @Description 包配置     * @author Tsing     * @Date 2021/5/3     */    public static PackageConfig getPackageConfig(String packageName) {        PackageConfig pc = new PackageConfig();        pc.setParent("com.tsing.product.api." + packageName);        pc.setEntity("entity");        pc.setMapper("mapper");        pc.setService("service");        return pc;    }    /**     * @Description 数据源配置     * @author Tsing     * @Date 2021/5/3     */    public static DataSourceConfig getDataSourceConfig() {        DataSourceConfig dsc = new DataSourceConfig();        dsc.setDbType(DbType.MYSQL);        dsc.setUrl("jdbc:mysql://192.168.1.5:3306/product_service?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true");        dsc.setDriverName("com.mysql.cj.jdbc.Driver");        dsc.setUsername("sapling");        dsc.setPassword("Li15150594533!");        return dsc;    }    /**     * @Description 全局配置     * @author Tsing     * @Date 2021/5/3     */    public static GlobalConfig getGlobalConfig(Boolean fileOverride) {        GlobalConfig gc = new GlobalConfig();        String projectPath = System.getProperty("user.dir");        gc.setOutputDir(projectPath + "/src/main/java");        //禁止重新文件        gc.setFileOverride(fileOverride);        gc.setActiveRecord(true);        gc.setBaseResultMap(true);        gc.setBaseColumnList(false);        gc.setSwagger2(false);        gc.setAuthor("dong.li");        gc.setOpen(false);        gc.setServiceName("%sService");        gc.setEntityName("%sEntity");        return gc;    }    /**     * @Description 自定义配置     * @author Tsing     * @Date 2021/5/3     */    public static InjectionConfig getInjectionConfig() {        InjectionConfig injectionConfig = new InjectionConfig() {            @Override            public void initMap() {            }        };        return injectionConfig;    }}