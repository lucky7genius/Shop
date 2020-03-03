package com.funtl.myshop.plus.cloud.controller;

import com.funtl.myshop.plus.cloud.dto.UmsAdminLoginLogDTO;
import com.funtl.myshop.plus.cloud.producer.MessageProducer;
import com.funtl.myshop.plus.commons.dto.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 * 创建时间: 2019-11-15 16:03
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@RestController
@RequestMapping("message")
public class MessageController {

    @Resource
    private MessageProducer messageProducer;

    @PostMapping(value = "admin/login/log")
    public ResponseResult<Void> sendAdminLoginLog(@RequestBody UmsAdminLoginLogDTO umsAdminLoginLogDTO){
        boolean flag = messageProducer.sendAdminLoginLog(umsAdminLoginLogDTO);
        if (flag) {
            return new ResponseResult<Void>(ResponseResult.CodeStatus.OK, "发送管理员登录日志成功");
        } else {
            return new ResponseResult<Void>(ResponseResult.CodeStatus.FAIL, "发送管理员登录日志失败");
        }
    }
}
