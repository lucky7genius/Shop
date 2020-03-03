package com.funtl.myshop.plus.commons.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * 描述: IP 地址信息
 * 创建时间: 2019-11-18 15:07
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@Data
public class IpInfo implements Serializable {
    private static final long serialVersionUID = -6246313701294144575L;
    private String ip;
    private String country;
    private String area;
    private String region;
    private String city;
    private String county;
    private String isp;
    private String country_id;
    private String area_id;
    private String region_id;
    private String city_id;
    private String county_id;
    private String isp_id;
}
