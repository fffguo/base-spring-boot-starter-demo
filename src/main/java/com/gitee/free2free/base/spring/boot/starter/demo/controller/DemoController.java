package com.gitee.free2free.base.spring.boot.starter.demo.controller;

import com.gitee.free2free.base.spring.boot.controller.BaseController;
import com.gitee.free2free.base.spring.boot.controller.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 演示使用BaseController
 *
 * @author lfg
 * @version 1.0
 */
@RestController
public class DemoController extends BaseController {

    @RequestMapping("/demo1")
    public Result demo1() {
        return success();
    }

    @RequestMapping("/demo2")
    public Result demo2() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("arg1", "value1");
        map.put("arg2", "value2");
        return success(map);
    }

    @RequestMapping("/demo3")
    public Result demo3() {
        return fail();
    }

    @RequestMapping("/demo4")
    public Result demo4() {
        return fail("这是失败的提示消息！");
    }

    @RequestMapping("/demo5")
    public Result demo5() {
        return fail(1001, "这是失败的提示消息！");
    }

}
