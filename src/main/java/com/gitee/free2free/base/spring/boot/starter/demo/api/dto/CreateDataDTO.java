package com.gitee.free2free.base.spring.boot.starter.demo.api.dto;

import lombok.Data;

import java.util.List;

/**
 * DataCreateApiDTO
 *
 * @author lfg
 * @version 1.0
 */
@Data
public class CreateDataDTO {
    /**
     * 创建成功的数据条数
     */
    private Integer count;
    /**
     * 创建失败的数据信息（您可根据其错误信息进行更正）
     */
    private List<CreateDataFailureDTO> failure;

    /**
     * 创建成功的数据
     */
    private List<CreateDataSuccessDTO> success;

}
