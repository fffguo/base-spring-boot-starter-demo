package com.gitee.free2free.base.spring.boot.starter.demo.api.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author lfg
 * @version 1.0
 */
@Data
public class CreateDataFailureDTO {

    /**
     * 创建该条数据时产生的错误信息
     */
    private String message;

    /**
     * 该条数据在data数组中的下标位置（从0开始）
     */
    @JSONField(name = "row_idx")
    private Integer rowIdx;

    /**
     * 错误码
     */
    private String status;

    /**
     * 自定义id
     */
    @JSONField(name = "ud_id")
    private String udId;
}
