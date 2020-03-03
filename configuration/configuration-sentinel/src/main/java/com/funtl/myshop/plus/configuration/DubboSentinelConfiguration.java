package com.funtl.myshop.plus.configuration;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:
 * 创建时间: 2019-09-17 11:32
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@Configuration
public class DubboSentinelConfiguration {

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

}
