package com.gitee.free2free.base.spring.boot.starter.demo.api.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.gitee.free2free.base.spring.boot.api.BaseApiResponse;
import com.gitee.free2free.base.spring.boot.starter.demo.api.dto.CreateDataDTO;
import lombok.Data;

/**
 * @author lfg
 * @version 1.0
 */
@Data
public class CreateDataResponse implements BaseApiResponse {
    /**
     * result
     */
    private CreateDataDTO result;

    /**
     * 状态码，0为请求成功，非常为错误
     */
    private int status;

    /**
     * 请求结果信息
     */
    private String message;

    @JSONField(name = "request_id")
    private String requestId;

    @Override
    public boolean isSuccess() {
        return status == 0;
    }
}
