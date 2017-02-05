package cn.qy.hibernatePractice.J32_a_configeration.Test;

import cn.qy.hibernatePractice.J32_a_configeration.Entity.Grils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * Created by Administrator on 2017/1/18.
 */
public class App {
    @Test
    public void testApp(){
       Grils grils = new Grils();
       grils.setMeeetDate(new Date());
       grils.setName("liyunfeng");

        Configuration config = new Configuration();
        // 默认加载src/hibenrate.cfg.xml文件
        config.configure();
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction ts = session.beginTransaction();

        session.save(grils);
        ts.commit();
        session.close();
        sf.close();

        }
    }


