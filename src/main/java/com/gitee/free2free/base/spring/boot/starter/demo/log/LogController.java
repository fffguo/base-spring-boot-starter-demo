package com.gitee.free2free.base.spring.boot.starter.demo.log;

import com.gitee.free2free.base.spring.boot.controller.BaseController;
import com.gitee.free2free.base.spring.boot.controller.Result;
import com.gitee.free2free.base.spring.boot.log.AroundLog;
import com.gitee.free2free.base.spring.boot.log.AroundType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 演示 controller的日志切面
 *
 * @author lfg
 * @version 1.0
 */
@RestController
public class LogController extends BaseController {


    /**
     * 最基础用法    @AroundLog
     * 请求url：http://127.0.0.1:8080/log1/value1?arg2=value2
     *
     * @param arg1 参数1
     * @param arg2 参数2
     * @return 返回结果
     */
    @AroundLog
    @RequestMapping("/log1/{arg1}")
    public Result log1(@PathVariable String arg1, @RequestParam String arg2) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("arg1", arg1);
        map.put("arg2", arg2);
        return success(map);
    }

    /**
     * 自定义接口名，只打印返回参数
     * 请求url：http://127.0.0.1:8080/log2/value1?arg2=value2
     *
     * @param arg1 参数1
     * @param arg2 参数2
     * @return 返回结果
     */
    @AroundLog(value = "日志DEMO2", type = AroundType.RESPONSE)
    @RequestMapping("/log2/{arg1}")
    public Result log2(@PathVariable String arg1, @RequestParam String arg2) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("arg1", arg1);
        map.put("arg2", arg2);
        return success(map);
    }

    /**
     * 自定义接口名，请求参数和返回参数都打印
     * 请求url：http://127.0.0.1:8080/log3/value1?arg2=value2
     *
     * @param arg1 参数1
     * @param arg2 参数2
     * @return 返回结果
     */
    @AroundLog(value = "日志DEMO3", type = AroundType.DATA)
    @RequestMapping("/log3/{arg1}")
    public Result log3(@PathVariable String arg1, @RequestParam String arg2) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("arg1", arg1);
        map.put("arg2", arg2);
        return success(map);
    }

}
