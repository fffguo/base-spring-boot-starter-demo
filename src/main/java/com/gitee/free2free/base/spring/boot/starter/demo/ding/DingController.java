package com.gitee.free2free.base.spring.boot.starter.demo.ding;

import com.gitee.free2free.base.spring.boot.controller.BaseController;
import com.gitee.free2free.base.spring.boot.controller.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 钉钉异常通知demo
 * 需要配置文件中 配置 base.ding.web-hook，才会触发推送
 * <p>
 * 1.自定义关键词校验：  需配置 '告警' 关键字
 * 2.签名校验：         需配置 base.ding.secret
 * <p>
 * 官方文档：https://ding-doc.dingtalk.com/doc#/serverapi2/qf2nxq
 * <p>
 * ps：
 * 1.可以自定义钉钉图片url  pictureUrl
 * 2.可以自定义跳转url，钉钉通知点击打开后的页面，程序会自动在该页面后拼接?sessionId=xxx&msg=xxx，可以实现自定义的异常占线方式
 *
 * @author lfg
 * @version 1.0
 */
@RestController
public class DingController extends BaseController {
    /**
     * 其他自定义异常：http://127.0.0.1:8080/ding1/value1?arg2=value2
     *
     * @return response
     */
    @RequestMapping("/ding1/{arg1}")
    public Result exception4(@PathVariable String arg1, @RequestParam String arg2) throws Exception {
        throw new Exception("数组下标越界");
    }
}
