package com.gitee.free2free.base.spring.boot.starter.demo.exception;

import com.gitee.free2free.base.spring.boot.controller.BaseController;
import com.gitee.free2free.base.spring.boot.controller.Result;
import com.gitee.free2free.base.spring.boot.exception.BaseException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 异常demo
 *
 * @author lfg
 * @version 1.0
 */
@RestController
public class ExceptionController extends BaseController {

    /**
     * 未知异常：http://127.0.0.1:8080/exception1
     *
     * @return response
     */
    @RequestMapping("/exception1")
    public Result exception1() {
        return success(1 / 0);
    }

    /**
     * BaseException：http://127.0.0.1:8080/exception2
     *
     * @return response
     */
    @RequestMapping("/exception2")
    public Result exception2() {
        throw new BaseException(1001, "BaseException");
    }

    /**
     * 其他自定义异常：http://127.0.0.1:8080/exception3
     *
     * @return response
     */
    @RequestMapping("/exception3")
    public Result exception3() {
        throw new ProjectException("EX123456", "ProjectException");
    }

}
