package com.gitee.free2free.base.spring.boot.starter.demo.api.response;


import com.gitee.free2free.base.spring.boot.starter.demo.api.AbstractMapApiResponse;
import com.gitee.free2free.base.spring.boot.starter.demo.api.dto.LocationDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 坐标转换 response
 * 逆地理编码的简单返回不包含兴趣点
 *
 * @author lfg
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TranslateResponse extends AbstractMapApiResponse {


    /**
     * 坐标转换结果，转换后的坐标顺序与输入顺序一致
     */
    private List<LocationDTO> locations;

}
