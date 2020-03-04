package com.example.SneakyCaloriesV2.session;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Component;

@Component
public class SessionFactoryInitializer {
	
	private static SessionFactory sessionFactory;
	
    @PostConstruct
    void initializeSessionFactory() {
    	 try {
             // Build a SessionFactory object from session-factory config
             // defined in the hibernate.cfg.xml file. In this file we
             // register the JDBC connection information, connection pool,
             // the hibernate dialect that we used and the mapping to our
             // hbm.xml file for each pojo (plain old java object).
             Configuration config = new Configuration();
             sessionFactory = config.configure().buildSessionFactory();
         } catch (Throwable e) {
             System.err.println("Error in creating SessionFactory object."
                     + e.getMessage());
             throw new ExceptionInInitializerError(e);
         }
    }
    
    
    public static SessionFactory getSessionFactory() {
    	return sessionFactory;
    }

}
