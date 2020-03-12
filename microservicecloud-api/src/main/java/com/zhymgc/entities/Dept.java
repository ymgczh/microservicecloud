package com.zhymgc.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by Administrator on 2020-3-11.
 * 2020年3月12日14:08:41
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{

    private Long deptno;

    private String dname;

    /**
     * 来自哪个数据库
     * 因为微服务可以一个服务对应一个数据库
     * 同一信息存到不同库里
     */
    private String db_source;

}
