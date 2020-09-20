package com.wf.shardingjdbcdemo;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author wf
 * @create 2020-09-13 17:41
 * @desc
 **/
@SpringBootTest
public class EncryptorTest {

    @Autowired
    private ApplicationContext applicationContext;
    @Qualifier("wfEncryptorBean")
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    public void contextLoads() {
        Environment environment = applicationContext.getBean(Environment.class);
        // 首先获取配置文件里的原始明文信息
        String mysqlOriginPswd = environment.getProperty("spring.shardingsphere.datasource.test1.password");
        String encrypt = encrypt(mysqlOriginPswd);
        System.out.println("加密后的密码：" + encrypt);
        System.out.println("解密后的密码：" + decrypt(encrypt));
    }

    private String decrypt(String mysqlOriginPswd) {
        return stringEncryptor.decrypt(mysqlOriginPswd);
    }

    private String encrypt(String mysqlOriginPswd) {
        return stringEncryptor.encrypt(mysqlOriginPswd);
    }
}
