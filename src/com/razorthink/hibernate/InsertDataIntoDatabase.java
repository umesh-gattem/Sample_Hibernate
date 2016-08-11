package com.razorthink.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.razorthink.hibernate.dto.UserDetails;

/**
 * This class shows how to insert data into the data into the database.
 * session.save() methos is used to insert data into database.
 * 
 * @author umesh
 * 
 * @since 11-08-2016
 *
 */

public class InsertDataIntoDatabase {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setUserName("umesh");
		user.setAddress("Bangalore");
		user.setDescription("employee at razorthink");
		user.setJoinDate(new Date());
		
		UserDetails secondUser=new UserDetails();
		
		secondUser.setUserName("kumar");
		secondUser.setAddress("Visakhapatnam");
		secondUser.setDescription("Student");
		secondUser.setJoinDate(new Date());
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(secondUser);
		session.getTransaction().commit();
	}

}
