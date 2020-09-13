package com.wf.shardingjdbcdemo.gengerator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wf
 * @create 2020-09-13 21:48
 * @desc
 **/
@Data
@TableName("t_user")
public class User {
    private Long userId;
    private String username;
    private String ustatus;

}
