package com.razorthink.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.razorthink.hibernate.dto.UserDetails;

/**
 * This class shows how to retrieve the data from the database . This class uses
 * session.get() method to select data from the database.
 * 
 * session.get() method takes two parameters first one is class name and second
 * one is primary key of the table so that which user details can be retrieved
 * 
 * @author umesh
 * 
 * @since 11-08-2016
 *
 */

public class RetrieveDataFromDatabase {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("The username retrieved from the database table is : " + user.getUserName());
	}

}
