package com.funtl.myshop.plus.upload.feign;

import com.funtl.myshop.plus.interceptor.configuration.FeignRequestConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * 描述: 文件上传.
 * 创建时间: 2019-09-16 11:42
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@FeignClient(value = "local-upload", path = "upload", configuration = FeignRequestConfiguration.class)
public interface UploadFeign {
    /**
     * 文件上传
     *
     * @param multipartFile {@code MultipartFile}
     * @return {@code String} 文件上传路径
     */
    @PostMapping(value = "")
    String upload(@RequestPart(value = "multipartFile") MultipartFile multipartFile);
}
