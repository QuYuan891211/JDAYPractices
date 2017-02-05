package cn.qy.hibernatePractice.J33_a_NVNrelationMap.Test;

import cn.qy.hibernatePractice.J33_a_NVNrelationMap.Entity.Students;
import cn.qy.hibernatePractice.J33_a_NVNrelationMap.Entity.Teachers;
import cn.qy.hibernatePractice.J33_b_1VNRelationMap.Entity.Child;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;


/**
 * Created by Administrator on 2017/2/5.
 */
public class App {
    private static Configuration cf;
    private static SessionFactory sf;
    static {
        cf = new Configuration();
        cf.configure();
        sf = cf.buildSessionFactory();

    }


    @Test
    public void save(){
        Session session = sf.openSession();
        session.beginTransaction();

        Students s1 = new Students();
        s1.setName("caoxi");
        Students s2 = new Students();
        s2.setName("quyuan");
        Students s3 = new Students();
        s3.setName("manan");

        Teachers t1 = new Teachers();
        t1.setName("haolinlin");
        t1.getStudentsSet().add(s2);
        t1.getStudentsSet().add(s3);

        Teachers t2 = new Teachers();
        t2.setName("wangyong");
        t2.getStudentsSet().add(s1);
        t2.getStudentsSet().add(s2);

        session.save(t1);
        session.save(t2);
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.getTransaction().commit();
        session.close();
    }

}
