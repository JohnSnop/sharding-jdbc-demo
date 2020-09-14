package com.wf.shardingjdbcdemo.handler;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wf
 * @create 2020-09-13 17:29
 * @desc
 **/
@RestController
public class AutoGenController {

    @Value("${spring.shardingsphere.datasource.test1.url}")
    private String url;
    @Value("${spring.shardingsphere.datasource.test1.username}")
    private String username;
    @Value("${spring.shardingsphere.datasource.test1.driver-class-name}")
    private String driverName;
    @Value("${spring.shardingsphere.datasource.test1.password}")
    private String password;

    @GetMapping("/gen/{tablename}")
    public String gen(@PathVariable String tablename) {
        AutoGenerator autoGenerator = new AutoGenerator();
        // 数据源配置
        DataSourceConfig config = new DataSourceConfig();
        config.setDbType(DbType.MYSQL);
        config.setUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverName(driverName);
        autoGenerator.setDataSource(config);
        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setOpen(false);
        globalConfig.setAuthor("wf");
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);
        // 包信息
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.wf.shardingjdbcdemo");
        packageConfig.setModuleName("gengerator");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        autoGenerator.setPackageInfo(packageConfig);
        // 配置策略
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setInclude(tablename);
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
        return "SUCCESS";
    }
}
