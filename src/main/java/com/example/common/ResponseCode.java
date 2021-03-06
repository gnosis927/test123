package com.example.common;

public enum  ResponseCode {

    USER_NULL(1,"无用户"),
    USER_ERROR(2,"密码错误"),
    REGIST_ERROR(3,"创建失败"),
    SEARCH_NULL(4,"无该商品"),
    NO_LOGIN(5,"未登录"),
    ADDGOODS_ERROR(6,"添加失败"),
    MODIFY_ERROR(8,"修改失败"),


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
