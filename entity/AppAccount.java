package entity;

import java.io.Serializable;

/**
 * (AppAccount)实体类
 *
 * @author makejava
 * @since 2020-03-23 19:34:12
 */
public class AppAccount implements Serializable {
    private static final long serialVersionUID = 958876733072023803L;
    
    private Integer pId;
    
    private String aName;
    
    private String aSex;
    
    private String aTime;
    
    private String aLastlogintime;


    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getAName() {
        return aName;
    }

    public void setAName(String aName) {
        this.aName = aName;
    }

    public String getASex() {
        return aSex;
    }

    public void setASex(String aSex) {
        this.aSex = aSex;
    }

    public String getATime() {
        return aTime;
    }

    public void setATime(String aTime) {
        this.aTime = aTime;
    }

    public String getALastlogintime() {
        return aLastlogintime;
    }

    public void setALastlogintime(String aLastlogintime) {
        this.aLastlogintime = aLastlogintime;
    }

}