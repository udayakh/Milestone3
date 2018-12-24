package com.wipro.et.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Component;

@Component
public class HibernateSessionFactoryUtil {

    private static SessionFactory sessionFactory = null;

    public static Session getSession() {

        if (sessionFactory == null) {
            createSessionFactory();
        }


        return sessionFactory.openSession();
    }


    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            createSessionFactory();
        }
        return sessionFactory;
    }


    private static void createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("/hibernate.cfg.xml");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).configure("/hibernate.cfg.xml").build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
}