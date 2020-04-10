package com.example.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-04-09 23:11:14
 */
public class User implements Serializable {
    private static final long serialVersionUID = -14545513202743081L;
    
    private Integer pId;
    
    private String rName;
    
    private Integer rAge;
    
    private String rTel;
    
    private String rMail;
    
    private String rSid;
    
    private String rPwd;


    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getRName() {
        return rName;
    }

    public void setRName(String rName) {
        this.rName = rName;
    }

    public Integer getRAge() {
        return rAge;
    }

    public void setRAge(Integer rAge) {
        this.rAge = rAge;
    }

    public String getRTel() {
        return rTel;
    }

    public void setRTel(String rTel) {
        this.rTel = rTel;
    }

    public String getRMail() {
        return rMail;
    }

    public void setRMail(String rMail) {
        this.rMail = rMail;
    }

    public String getRSid() {
        return rSid;
    }

    public void setRSid(String rSid) {
        this.rSid = rSid;
    }

    public String getRPwd() {
        return rPwd;
    }

    public void setRPwd(String rPwd) {
        this.rPwd = rPwd;
    }

}