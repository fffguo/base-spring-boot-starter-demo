package com.gitee.free2free.base.spring.boot.starter.demo.api.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author lfg
 * @version 1.0
 */
@Data
public class MapPointDTO {

    /**
     * 坐标
     */
    private LocationDTO location;

    /**
     * _address
     */
    private String address;
    /**
     * 必填	地点名称
     */
    private String title;

    /**
     * 即自定义ID（user defined id) ，若您已有库表数据ID或编号，可填入此字段，以便关联管理。
     * 唯一性约束：
     * 1.可在建表时设置是否启用ud_id的唯一性约束（表创建后不可更改）
     * 2.启用唯一性约束后，ud_id值将不可重复，同时将支持通过ud_id进行数据的更新、删除，否则仅可用于搜索筛选
     */
    @JSONField(name = "ud_id")
    private String udId;

}
