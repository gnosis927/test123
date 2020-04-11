package com.example.entity;

import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2020-04-11 10:33:53
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 178154850088587298L;
    
    private Integer gId;
    
    private String gName;
    
    private Integer gNum;
    
    private Object gPrice;
    
    private String gKind;


    public Integer getGId() {
        return gId;
    }

    public void setGId(Integer gId) {
        this.gId = gId;
    }

    public String getGName() {
        return gName;
    }

    public void setGName(String gName) {
        this.gName = gName;
    }

    public Integer getGNum() {
        return gNum;
    }

    public void setGNum(Integer gNum) {
        this.gNum = gNum;
    }

    public Object getGPrice() {
        return gPrice;
    }

    public void setGPrice(Object gPrice) {
        this.gPrice = gPrice;
    }

    public String getGKind() {
        return gKind;
    }

    public void setGKind(String gKind) {
        this.gKind = gKind;
    }

}