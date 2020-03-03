package com.funtl.myshop.plus.cloud.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 描述:
 * 创建时间: 2019-11-15 15:31
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
public interface MessageSource {
    @Output("admin-login-log-topic")
    MessageChannel adminLoginLog();
}
