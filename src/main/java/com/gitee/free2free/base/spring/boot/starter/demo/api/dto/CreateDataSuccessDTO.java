package com.gitee.free2free.base.spring.boot.starter.demo.api.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author lfg
 * @version 1.0
 */
@Data
public class CreateDataSuccessDTO {

    /**
     * 数据创建成功，返回系统生成的唯一标识（id）
     */
    private String id;

    /**
     * 该条数据在data数组中的下标位置（从0开始）
     */
    @JSONField(name = "row_idx")
    private Integer rowIdx;

    /**
     * 自定义id
     */
    @JSONField(name = "ud_id")
    private String udId;
}
