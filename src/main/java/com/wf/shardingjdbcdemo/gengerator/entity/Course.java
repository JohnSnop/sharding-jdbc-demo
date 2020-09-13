package com.wf.shardingjdbcdemo.gengerator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wf
 * @since 2020-09-13
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Course implements Serializable {

    private static final long serialVersionUID=1L;

      private Long cid;

    private String cname;

    private Long userId;

    private String cStatus;


}
