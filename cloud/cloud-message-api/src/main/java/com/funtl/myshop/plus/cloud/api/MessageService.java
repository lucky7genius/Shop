package com.funtl.myshop.plus.cloud.api;

import com.funtl.myshop.plus.cloud.dto.UmsAdminLoginLogDTO;

/**
 * 描述:
 * 创建时间: 2019-11-18 15:46
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
public interface MessageService {

    public boolean sendAdminLoginLog(UmsAdminLoginLogDTO dto);
}
