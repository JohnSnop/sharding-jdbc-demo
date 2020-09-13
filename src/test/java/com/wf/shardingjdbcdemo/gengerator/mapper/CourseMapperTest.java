package com.wf.shardingjdbcdemo.gengerator.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wf.shardingjdbcdemo.gengerator.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wf
 * @create 2020-09-13 18:18
 * @desc
 **/
@SpringBootTest
public class CourseMapperTest {
    @Resource
    private CourseMapper courseMapper;

    @Test
    public void addDb() {
        Course course = new Course();
        course.setCname("JavaDb");
        course.setUserId(100019L);
        course.setCStatus("Yes");
        courseMapper.insert(course);
    }

    @Test
    public void findDb() {
        QueryWrapper<Course> wrapper = new QueryWrapper();
        wrapper.eq("user_id", 100018L);
        System.out.println(courseMapper.selectOne(wrapper));
    }

    @Test
    public void add() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCname("Java" + i);
            course.setUserId(100000L);
            course.setCStatus("Yes" + i * i);
            courseMapper.insert(course);
        }

    }
    @Test
    public void query() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.likeRight("cname", "Java");
        List list = courseMapper.selectList(wrapper);
        list.forEach(System.out::println);
    }

}