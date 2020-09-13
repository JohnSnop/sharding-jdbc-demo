package com.wf.shardingjdbcdemo.gengerator.service.impl;

import com.wf.shardingjdbcdemo.gengerator.entity.Course;
import com.wf.shardingjdbcdemo.gengerator.mapper.CourseMapper;
import com.wf.shardingjdbcdemo.gengerator.service.CourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wf
 * @since 2020-09-13
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

}
