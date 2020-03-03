package com.funtl.myshop.plus.provider;

import com.funtl.myshop.plus.configuration.DubboSentinelConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 描述:
 * 创建时间: 2019-11-15 11:18
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@SpringBootApplication(scanBasePackageClasses = {UmsAdminLoginLogProviderApplication.class, DubboSentinelConfiguration.class})
@MapperScan(basePackages = "com.funtl.myshop.plus.provider.mapper")
public class UmsAdminLoginLogProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UmsAdminLoginLogProviderApplication.class, args);
    }
}