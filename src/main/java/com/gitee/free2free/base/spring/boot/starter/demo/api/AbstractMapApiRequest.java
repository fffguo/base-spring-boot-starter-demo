package com.gitee.free2free.base.spring.boot.starter.demo.api;

import com.alibaba.fastjson.annotation.JSONField;
import com.gitee.free2free.base.spring.boot.api.BaseApiRequest;
import com.gitee.free2free.base.spring.boot.api.BaseApiResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author lfg
 * @version 1.0
 */
@Data
@NoArgsConstructor
public abstract class AbstractMapApiRequest<Response extends BaseApiResponse> implements BaseApiRequest<Response> {

    /**
     * 开发密钥（Key）
     */
    @NonNull
    private String key;

    /**
     * 表Id
     */
    @NonNull
    @JSONField(name = "table_id")
    private String tableId;

}

