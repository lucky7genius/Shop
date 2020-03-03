package com.funtl.myshop.plus.business.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述: 登录信息.
 * 创建时间: 2019-09-11 14:49
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@Data
public class LoginInfo implements Serializable {
    private static final long serialVersionUID = 2424270893562281114L;

    private String name;
    private String avatar;
    private String nickName;
}
