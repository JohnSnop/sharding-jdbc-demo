package com.wf.shardingjdbcdemo.gengerator.mapper;

import com.wf.shardingjdbcdemo.gengerator.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author wf
 * @create 2020-09-13 21:54
 * @desc
 **/
@SpringBootTest
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testAdd() {
        User user = new User();
        user.setUsername("Helo");
        user.setUstatus("HHHHHH");
        userMapper.insert(user);
    }


}