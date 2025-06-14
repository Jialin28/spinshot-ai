package com.spinshot.spinshotai.exception;

import com.spinshot.spinshotai.model.response.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public BaseResponse handleException(Exception e) {
        BaseResponse response = new BaseResponse();
        response.setCode(500);
        response.setMsg("系统错误: " + e.getMessage());
        return response;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public BaseResponse handleIllegalArgumentException(IllegalArgumentException e) {
        BaseResponse response = new BaseResponse();
        response.setCode(400);
        response.setMsg("参数错误: " + e.getMessage());
        return response;
    }
}