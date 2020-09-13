package com.wf.shardingjdbcdemo.gengerator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wf
 * @create 2020-09-13 22:09
 * @desc
 **/
@Data
@TableName("t_udict")
public class Udict {
    private Long dictId;
    private String ustatus;
    private String uvalue;
}
