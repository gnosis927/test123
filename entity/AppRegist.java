package entity;

import java.io.Serializable;

/**
 * (AppRegist)实体类
 *
 * @author makejava
 * @since 2020-03-23 19:33:50
 */
public class AppRegist implements Serializable {
    private static final long serialVersionUID = 941885505719917433L;
    
    private Integer pId;
    
    private String rName;
    
    private Integer rAge;
    
    private Integer rTel;
    
    private String rMail;
    
    private String rSid;


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

    public Integer getRTel() {
        return rTel;
    }

    public void setRTel(Integer rTel) {
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

}