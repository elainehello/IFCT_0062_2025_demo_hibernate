package com.elainevalles.demo.repository;

import com.elainevalles.demo.model.Studio;
import com.elainevalles.demo.model.StudioPK;
import com.elainevalles.demo.persistence.HibernateUtil;
import org.hibernate.Session;

public class StudioDAO {

    public static void create(Studio studio) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(studio);
        session.getTransaction().commit();
        session.close();
    }

    public static Studio read(StudioPK id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Studio studio = session.get(Studio.class, id);
        session.close();
        return studio;
    }

//    public static void update(Studio studio) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        session.merge(studio);
//        session.getTransaction().commit();
//    }
//
//    public static void delete(Studio studio) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        session.remove(studio);
//        session.getTransaction().commit();
//        session.close();
//        }


}

