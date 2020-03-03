package com.funtl.myshop.plus.cloud.feign;

import com.funtl.myshop.plus.cloud.feign.fallback.MessageFeignFallback;
import com.funtl.myshop.plus.interceptor.configuration.FeignRequestConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 描述:
 * 创建时间: 2019-11-15 15:13
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@FeignClient(value = "cloud-message", path = "message", configuration = FeignRequestConfiguration.class, fallback = MessageFeignFallback.class)
public interface MessageFeign {
//    @PostMapping(value = "admin/login/log")
//    public String sendAdminLoginLog(UmsAdminLoginLogDTO umsAdminLoginLogDTO);
}
