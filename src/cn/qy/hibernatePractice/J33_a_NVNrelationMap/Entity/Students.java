package cn.qy.hibernatePractice.J33_a_NVNrelationMap.Entity;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Students {
    private int ID;
    private String name;

    public Set<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(Set<Teachers> teachersList) {
        this.teachersList = teachersList;
    }

    private Set<Teachers> teachersList = new HashSet<Teachers>();
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Students(){
    }
}
