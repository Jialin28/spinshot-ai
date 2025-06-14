package com.spinshot.spinshotai.model.response;

public class BaseResponse {

    private int code;
    private String msg;

    public BaseResponse() {
        this.code = 0;
        this.msg = "success";
    }

    public BaseResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static BaseResponse success() {
        return new BaseResponse();
    }

    public static BaseResponse error(int code, String msg) {
        return new BaseResponse(code, msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
