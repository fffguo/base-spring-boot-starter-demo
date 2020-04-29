package com.gitee.free2free.base.spring.boot.starter.demo.api.request;

import cn.hutool.http.ContentType;
import cn.hutool.http.Method;
import com.gitee.free2free.base.spring.boot.starter.demo.api.AbstractMapApiRequest;
import com.gitee.free2free.base.spring.boot.starter.demo.api.dto.MapPointDTO;
import com.gitee.free2free.base.spring.boot.starter.demo.api.response.CreateDataResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

/**
 * @author lfg
 * @version 1.0
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CreateDataRequest extends AbstractMapApiRequest<CreateDataResponse> {

    @NonNull
    private List<MapPointDTO> data;

    @Override
    public String getUrl() {
        return "https://apis.map.qq.com/place_cloud/data/create";
    }

    @Override
    public Method getMethod() {
        return Method.POST;
    }

    @Override
    public ContentType getContentType() {
        return ContentType.JSON;
    }

    @Override
    public Class<CreateDataResponse> getResponse() {
        return CreateDataResponse.class;
    }

}

