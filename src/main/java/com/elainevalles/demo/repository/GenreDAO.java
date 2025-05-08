package com.elainevalles.demo.repository;

import com.elainevalles.demo.model.Genre;
import com.elainevalles.demo.persistence.HibernateUtil;
import org.hibernate.Session;

public class GenreDAO {
    public static void create(Genre genre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(genre);
        session.getTransaction().commit();
        session.close();
    }

    public static Genre read(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Genre genre = session.get(Genre.class, id);
        session.close();
        return genre;
    }

    public static void update(Genre genre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(genre);
        session.getTransaction().commit();
    }

    public static void delete(Genre genre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.remove(genre);
        session.getTransaction().commit();
        session.close();
    }
}

