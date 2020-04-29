package com.gitee.free2free.base.spring.boot.starter.demo.api;

import com.alibaba.fastjson.JSONObject;
import com.gitee.free2free.base.spring.boot.api.BaseApi;
import com.gitee.free2free.base.spring.boot.starter.demo.api.dto.LocationDTO;
import com.gitee.free2free.base.spring.boot.starter.demo.api.dto.MapPointDTO;
import com.gitee.free2free.base.spring.boot.starter.demo.api.request.CreateDataRequest;
import com.gitee.free2free.base.spring.boot.starter.demo.api.request.TranslateRequest;
import com.gitee.free2free.base.spring.boot.starter.demo.api.response.CreateDataResponse;
import com.gitee.free2free.base.spring.boot.starter.demo.api.response.TranslateResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Collections;

/**
 * api test
 *
 * @author lfg
 * @version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiTest {

    /**
     * 腾讯地图 key
     */
    private static final String KEY = "R4SBZ-XKQC6-2OMS3-MBK4H-NBOZO-Q7FSJ";

    /**
     * 腾讯地图-地点云-表ID
     */
    private static final String TABLE_ID = "5e9d765331806b197a4be9b7";

    /**
     * 直接执行   baseApi.execute()
     * 会根据request的类型自动构造请求
     * 调用方需要知道request的类型才能调用
     */
    @Test
    public void get1() {
        BaseApi baseApi = new BaseApi();

        TranslateRequest request = new TranslateRequest();
        request.setLocations("39.12,116.83;30.21,115.43");
        request.setType(1);
        request.setKey(KEY);

        TranslateResponse response = baseApi.execute(request);
        Assert.assertTrue(response.isSuccess());
        System.out.println(JSONObject.toJSONString(response));
    }

    /**
     * 先封装一层 MapApi，在MapApi中执行baseApi.execute()
     * 调用方需要知道调用哪个方法，根据调用方法去构造请求
     */
    @Test
    public void get2() {
        MapApi api = new MapApi();

        TranslateRequest request = new TranslateRequest();
        request.setLocations("39.12,116.83;30.21,115.43");
        request.setType(1);
        request.setKey(KEY);

        TranslateResponse response = api.translate(request);
        Assert.assertTrue(response.isSuccess());
        System.out.println(JSONObject.toJSONString(response));

    }

    /**
     * 相对于同一类的请求（例如腾讯地图），也可以提取出公共的请求参数 和 返回参数 再封装一层
     * 这里请求参数就可以提取出 key tableId，返回参数可以提取出 status message requestId successful
     */
    @Test
    public void post1() {
        MapApi api = new MapApi();

        MapPointDTO dto = new MapPointDTO();
        dto.setLocation(new LocationDTO(BigDecimal.valueOf(39.12), BigDecimal.valueOf(116.83)));
        dto.setTitle("test title");
        dto.setUdId(String.valueOf(System.currentTimeMillis()));

        CreateDataRequest request = new CreateDataRequest();
        request.setTableId(TABLE_ID);
        request.setData(Collections.singletonList(dto));
        request.setKey(KEY);

        CreateDataResponse response = api.createData(request);
        Assert.assertTrue(response.isSuccess());
        System.out.println(JSONObject.toJSONString(response));

    }
}
