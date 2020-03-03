package com.funtl.myshop.plus.cloud.feign.fallback;

import com.funtl.myshop.plus.cloud.feign.MessageFeign;
import org.springframework.stereotype.Component;

/**
 * 描述:
 * 创建时间: 2019-11-15 15:17
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@Component
public class MessageFeignFallback implements MessageFeign {
    private static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";
}
