package com.funtl.myshop.plus.message.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 描述:
 * 创建时间: 2019-11-18 11:44
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
public interface AdminLoginLogSink {
    @Input("admin-login-log-topic")
    SubscribableChannel adminLoginLog();
}