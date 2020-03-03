package com.funtl.myshop.plus.provider.service;

import com.funtl.myshop.plus.provider.api.UmsAdminLoginLogService;
import com.funtl.myshop.plus.provider.domain.UmsAdminLoginLog;
import com.funtl.myshop.plus.provider.mapper.UmsAdminLoginLogMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * 描述:
 * 创建时间: 2019-11-15 11:39
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@Service(version = "1.0.0")
public class UmsAdminLoginLogServiceImpl implements UmsAdminLoginLogService {

    @Resource
    private UmsAdminLoginLogMapper umsAdminLoginLogMapper;

    @Override
    public int insert(UmsAdminLoginLog umsAdminLoginLog) {
        return umsAdminLoginLogMapper.insert(umsAdminLoginLog);
    }
}
