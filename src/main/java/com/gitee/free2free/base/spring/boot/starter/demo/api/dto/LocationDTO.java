package com.gitee.free2free.base.spring.boot.starter.demo.api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;


/**
 * 坐标转换结果，转换后的坐标顺序与输入顺序一致
 *
 * @author lfg
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class LocationDTO {

    /**
     * 纬度
     */
    private BigDecimal lat;

    /**
     * 经度
     */
    private BigDecimal lng;

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }
}
