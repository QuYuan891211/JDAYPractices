package cn.qy.hibernatePractice.J33_a_NVNrelationMap.Entity;



import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/2/5.
 */
public class Teachers {
    private int ID;
    private String name;
    private Set<Students> studentsSet = new HashSet<Students>();

    public Set<Students> getStudentsSet() {
        return studentsSet;
    }

    public void setStudentsSet(Set<Students> studentsSet) {
        this.studentsSet = studentsSet;
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
