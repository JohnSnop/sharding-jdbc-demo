package com.wf.shardingjdbcdemo.gengerator.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wf.shardingjdbcdemo.gengerator.entity.Udict;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author wf
 * @create 2020-09-13 22:24
 * @desc
 **/
@SpringBootTest
class UdictMapperTest {
    @Resource
    private UdictMapper udictMapper;

    @Test
    public void testAdd() {
        Udict udict = new Udict();
        udict.setUstatus("A");
        udict.setUvalue("使用中");
        udictMapper.insert(udict);

        Udict udict2 = new Udict();
        udict2.setUstatus("B");
        udict2.setUvalue("使用中..");
        udictMapper.insert(udict2);
    }

    @Test
    public void testDelete() {
        QueryWrapper<Udict> wrapper = new QueryWrapper<>();
        wrapper.eq("dict_id", 512031408860954625L);
        udictMapper.delete(wrapper);
    }
}