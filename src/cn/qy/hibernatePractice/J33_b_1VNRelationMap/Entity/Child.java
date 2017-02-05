package cn.qy.hibernatePractice.J33_b_1VNRelationMap.Entity;

/**
 * Created by Administrator on 2017/2/5.
 */
public class Child {
    private int ID;
    private Father father;

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Child(int ID, String name) {
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

    private String name;
    public Child(){

    }
}
