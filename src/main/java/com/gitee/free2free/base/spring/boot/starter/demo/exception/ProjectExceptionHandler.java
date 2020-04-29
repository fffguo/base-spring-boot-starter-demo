package com.gitee.free2free.base.spring.boot.starter.demo.exception;

import com.alibaba.fastjson.JSONObject;
import com.gitee.free2free.base.spring.boot.controller.Result;
import com.gitee.free2free.base.spring.boot.exception.BaseException;
import com.gitee.free2free.base.spring.boot.exception.BaseExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

/**
 * 项目自定义 异常处理，继承 baseExceptionHandler
 *
 * @author lfg
 * @version 1.0
 */
@Slf4j
@ControllerAdvice
public class ProjectExceptionHandler extends BaseExceptionHandler {
    public ProjectExceptionHandler() {
        super();
    }
    //--------------------------------------可以自定义其他异常处理方法、或重写父类方法-----------------------------

    /**
     * 处理 ProjectException
     *
     * @param response response
     * @param e        异常
     */
    @ExceptionHandler(ProjectException.class)
    public void handleBaseException(HttpServletResponse response, ProjectException e) {
        log.error("ProjectException:{}", e.getMessage(), e);
        print(response, JSONObject.toJSONString(new Result(e.getCode(), e.getMessage())));
    }

    @Override
    public void handleServiceException(HttpServletResponse response, BaseException e) {
        super.handleServiceException(response, e);
    }

    @Override
    public void handleMissingServletRequestParameterException(HttpServletResponse response, MissingServletRequestParameterException e) {
        super.handleMissingServletRequestParameterException(response, e);
    }

    @Override
    public void handleMethodArgumentNotValidException(HttpServletResponse response, MethodArgumentNotValidException e) {
        super.handleMethodArgumentNotValidException(response, e);
    }

    @Override
    public void handleException(HttpServletResponse response, Exception e) {
        super.handleException(response, e);
    }

    @Override
    protected void print(HttpServletResponse response, String result) {
        super.print(response, result);
    }

    @Override
    protected void noticeDing(Exception e) {
        super.noticeDing(e);
    }
}
