package com.funtl.myshop.plus.cloud;

import com.funtl.myshop.plus.cloud.message.MessageSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * 描述:
 * 创建时间: 2019-11-15 15:24
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({MessageSource.class})
public class CloudMessageApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudMessageApplication.class, args);
    }
}
