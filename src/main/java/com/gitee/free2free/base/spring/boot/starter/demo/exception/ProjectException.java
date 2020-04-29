package com.gitee.free2free.base.spring.boot.starter.demo.exception;

import com.gitee.free2free.base.spring.boot.exception.BaseException;

/**
 * 项目自定义异常，继承baseException
 *
 * @author lfg
 * @version 1.0
 */
public class ProjectException extends BaseException {
    public ProjectException(String message) {
        super(message);
    }

    public ProjectException(String code, String message) {
        super(code, message);
    }

    public ProjectException(Integer code, String message) {
        super(code, message);
    }
}
