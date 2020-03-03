package com.funtl.myshop.plus.provider.tests;
import com.funtl.myshop.plus.provider.api.UmsAdminLoginLogService;
import com.funtl.myshop.plus.provider.domain.UmsAdminLoginLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 描述:
 * 创建时间: 2019-11-15 11:50
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
@Rollback
public class UmsAdminLoginLogTests {
    @Resource
    private UmsAdminLoginLogService umsAdminLoginLogService;

    @Test
    public void testInsert(){
        UmsAdminLoginLog umsAdminLoginLog = new UmsAdminLoginLog();
        umsAdminLoginLog.setAdminId(1L);
        umsAdminLoginLog.setCreateTime(new Date());
        umsAdminLoginLog.setIp("0.0.0.0");
        umsAdminLoginLog.setAddress("0.0.0.0");
        umsAdminLoginLog.setUserAgent("0.0.0.0");
        umsAdminLoginLogService.insert(umsAdminLoginLog);
    }
}
