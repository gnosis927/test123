package com.example.common;

public enum  ResponseCode {

    USER_NULL(1,"无用户"),
    USER_ERROR(2,"密码错误"),
    SIGN_ERROR(3,"注册失败")
    ;


    private int code;
    private String msg;

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

    ResponseCode(int code, String msg){
        this.code=code;
        this.msg=msg;

    }
}
