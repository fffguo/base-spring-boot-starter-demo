package com.gitee.free2free.base.spring.boot.starter.demo.api;


import com.gitee.free2free.base.spring.boot.api.BaseApi;
import com.gitee.free2free.base.spring.boot.starter.demo.api.request.CreateDataRequest;
import com.gitee.free2free.base.spring.boot.starter.demo.api.request.TranslateRequest;
import com.gitee.free2free.base.spring.boot.starter.demo.api.response.CreateDataResponse;
import com.gitee.free2free.base.spring.boot.starter.demo.api.response.TranslateResponse;

/**
 * 腾讯地图
 * <p>
 * 调用示例在 Test类中：src\test\java\com\gitee\free2free\base\spring\boot\starter\demo\api\ApiTest.java
 *
 * @author lfg
 * @version 1.0
 */
public class MapApi extends BaseApi {

    /**
     * 腾讯地图-转换经纬度
     * 文档地址：https://lbs.qq.com/service/webService/webServiceGuide/webServiceTranslate
     *
     * @param request 请求参数
     * @return response
     */
    public TranslateResponse translate(TranslateRequest request) {
        return execute(request);
    }

    /**
     * 腾讯地点云 创建数据
     * 文档地址：https://lbs.qq.com/service/placeCloud/placeCloudGuide/cloudDataManage
     *
     * @param request 请求参数
     * @return response
     */
    public CreateDataResponse createData(CreateDataRequest request) {
        return execute(request);
    }

}
