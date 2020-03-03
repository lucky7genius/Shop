package com.funtl.myshop.plus.provider.api;

import com.funtl.myshop.plus.provider.domain.UmsAdminLoginLog;

/**
 * 描述:
 * 创建时间: 2019-11-15 11:39
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
public interface UmsAdminLoginLogService {
    /**
     * 新增日志
     *
     * @param umsAdminLoginLog {@link UmsAdminLoginLog}
     * @return {@code int} 大于 0 则表示添加成功
     */
    int insert(UmsAdminLoginLog umsAdminLoginLog);
}
