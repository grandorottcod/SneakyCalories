package com.example.SneakyCaloriesV2.daos;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SneakyCaloriesV2.core.AppDto;
import com.example.SneakyCaloriesV2.pojo.Users;
import com.example.SneakyCaloriesV2.session.SessionFactoryInitializer;

@Component
public class UsersDao implements UsersDaoImpl  {
	
	
	@Override
	public void createNewUser(Users user) {
		Session session = SessionFactoryInitializer.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.persist(user);
	        tx.commit();	
		}catch(HibernateException e) {
			if(tx != null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}
	

}
