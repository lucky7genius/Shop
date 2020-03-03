package com.funtl.myshop.plus.upload.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述: 文件信息.
 * 创建时间: 2019-09-16 11:41
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileInfo implements Serializable {
    private static final long serialVersionUID = -6300075933221143371L;
    /**
     * 文件路径
     */
    private String url;
    private String md5;
    private String path;
    private String domain;
    private String scene;
    private String size;
    private String mtime;
    private String scenes;
    private String retmsg;
    private String retcode;
    private String src;
}
