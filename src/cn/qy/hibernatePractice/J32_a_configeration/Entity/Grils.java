package cn.qy.hibernatePractice.J32_a_configeration.Entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Grils {
    public int getGID() {
        return GID;
    }

    public void setGID(int GID) {
        this.GID = GID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMeeetDate() {
        return meeetDate;
    }

    public void setMeeetDate(Date meeetDate) {
        this.meeetDate = meeetDate;
    }

    private int GID;
    private String name;
    private Date meeetDate;


}
