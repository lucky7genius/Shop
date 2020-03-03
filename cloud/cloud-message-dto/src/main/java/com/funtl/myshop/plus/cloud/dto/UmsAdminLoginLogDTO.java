package com.funtl.myshop.plus.cloud.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述:
 * 创建时间: 2019-11-15 15:09
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@Data
public class UmsAdminLoginLogDTO implements Serializable {
    private static final long serialVersionUID = -4798414052038455596L;

    private Long id;
    private Long adminId;
    private Date createTime;
    private String ip;
    private String address;
    private String userAgent;
}
