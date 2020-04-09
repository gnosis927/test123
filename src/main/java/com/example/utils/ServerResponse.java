package com.example.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> {

    private int status;
    private T data;
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private ServerResponse(){}
    private ServerResponse(int status){
        this.status=status;
    }
    private ServerResponse(int status,T data){
        this.status=status;
        this.data=data;
    }
    private ServerResponse(int status,T data, String msg){
        this.status=status;
        this.data=data;
        this.msg=msg;
    }
    @JsonIgnore
    public boolean isSuccess(){
        return this.status==0;
    }
    public static ServerResponse createSRBySuccess(){
        return new ServerResponse(0);
    }
    public static <T> ServerResponse createSRBySuccess(T data){
        return new ServerResponse(0,data);
    }
    public static <T> ServerResponse createSRBySuccess(T data,String msg){
        return new ServerResponse(0,data,msg);
    }
    public static ServerResponse createSRBySuccess(int status){
        return new ServerResponse(status);
    }
    public static ServerResponse createSRBySuccess(int status,String msg){
        return new ServerResponse(status,null,msg);
    }


}

