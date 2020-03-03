package com.funtl.myshop.plus.upload.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import cn.hutool.core.io.resource.InputStreamResource;
import cn.hutool.core.lang.Console;
import cn.hutool.http.HttpUtil;
import com.funtl.myshop.plus.commons.dto.ResponseResult;
import com.funtl.myshop.plus.commons.utils.MapperUtils;
import com.funtl.myshop.plus.upload.dto.FileInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 描述: 文件上传服务
 * 创建时间: 2019-09-16 11:44
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@RestController
@RequestMapping(value = "upload")
public class UploadController {
    /**
     * 文件上传
     *
     * @param multipartFile @{code MultipartFile}
     * @return {@link ResponseResult<FileInfo>} 文件上传路径
     */
    @PostMapping(value = "")
    public ResponseResult<FileInfo> upload(MultipartFile multipartFile) throws Exception {
        FileInfo result = null;
        try {
            String lastname = ".jpg";
            String filename = multipartFile.getOriginalFilename();
            int index = 0;
            if (filename != null) {
                index = filename.lastIndexOf(".");
                lastname = filename.substring(index, filename.length());
            }
            InputStreamResource isr = new InputStreamResource(multipartFile.getInputStream(),
                    UUID.randomUUID().toString().replace("-", "") + lastname);

            Map<String, Object> params = new HashMap<>();
            params.put("file", isr);
            params.put("path", "avatar");
            params.put("output", "json");
            String resp = HttpUtil.post("http://192.168.1.211:10001/upload", params);
            Console.log("resp: {}", resp);
            result = MapperUtils.json2pojo(resp, FileInfo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseResult<FileInfo>(ResponseResult.CodeStatus.OK, "文件上传成功", result);
    }
}
