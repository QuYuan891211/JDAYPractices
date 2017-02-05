package cn.qy.hibernatePractice.J33_b_1VNRelationMap.Entity;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/2/5.
 */
public class Father {
    private int ID;
    private String name;

    private Set<Child> child = new LinkedHashSet<Child>();

    public Set<Child> getChild() {
        return child;
    }

    public void setChild(Set<Child> child) {
        this.child = child;
    }
    public Father(){

    }

    public Father(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

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
}
