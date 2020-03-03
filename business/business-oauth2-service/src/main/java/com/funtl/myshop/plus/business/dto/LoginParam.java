package com.funtl.myshop.plus.business.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述: 登录参数.
 * 创建时间: 2019-09-11 9:35
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@Data
public class LoginParam implements Serializable {
    private static final long serialVersionUID = 4440200668453816646L;

    private String username;
    private String password;
}
