package com.funtl.myshop.plus.provider.tests;

import com.funtl.myshop.plus.provider.api.UmsAdminService;
import com.funtl.myshop.plus.provider.domain.UmsAdmin;
import com.funtl.myshop.plus.provider.mapper.UmsAdminMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * 描述:
 * 创建时间: 2019-09-05 14:56
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
@Rollback
public class UmsAdminTests {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Resource
    private UmsAdminService umsAdminService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void testSelectAll() {
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectAll();
        umsAdmins.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setUsername("xu");
        umsAdmin.setPassword(passwordEncoder.encode("123456"));
        umsAdmin.setIcon("");
        umsAdmin.setEmail("");
        umsAdmin.setNickName("");
        umsAdmin.setNote("");
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setLoginTime(new Date());
        umsAdmin.setStatus(0);

        int result = umsAdminService.insert(umsAdmin);
        Assert.assertEquals(result, 1);
    }
}
