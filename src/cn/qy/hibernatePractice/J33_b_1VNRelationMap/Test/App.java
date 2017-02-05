package cn.qy.hibernatePractice.J33_b_1VNRelationMap.Test;

import cn.qy.hibernatePractice.J33_b_1VNRelationMap.Entity.Child;
import cn.qy.hibernatePractice.J33_b_1VNRelationMap.Entity.Father;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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

        Father father1 = new Father();
        father1.setName("quyuan");
        Father father2 = new Father();
        father2.setName("quyuan2");

        Child child1 = new Child();
        child1.setName("caoxi1");
        Child child2 = new Child();
        child2.setName("yangtong1");
        Child child3 = new Child();
        child3.setName("caoxi2");
        Child child4 = new Child();
        child4.setName("yangtong2");

        father1.getChild().add(child1);
        father1.getChild().add(child2);
        father2.getChild().add(child3);
        father2.getChild().add(child4);

//先保存一的一方
        session.save(child1);
        session.save(child2);
        session.save(child3);
        session.save(child4);
        session.save(father1);
        session.save(father2);
        session.getTransaction().commit();
        session.close();

    }
    @Test
    public void update(){
       Session session =  sf.openSession();
       session.beginTransaction();
       Father father = (Father)session.get(Father.class,1);
        System.out.println(father.getChild().toString());
        Child child = (Child)session.get(Child.class,1);
        Father fatherNew = child.getFather();
        System.out.println(fatherNew);
        fatherNew.setName("BUBUBU");
        System.out.println(fatherNew);
        session.saveOrUpdate(fatherNew);
        session.getTransaction().commit();
        session.close();


    }
}
