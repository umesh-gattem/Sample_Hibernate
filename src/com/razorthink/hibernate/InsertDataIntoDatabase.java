package com.razorthink.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.razorthink.hibernate.dto.Address;
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
		Address address=new Address();
		user.setUserName("umesh");
		user.setDescription("employee at razorthink");
		user.setJoinDate(new Date());
		address.setCity("Bangalore");
		address.setStreet("Tyagarajanagar");
		address.setState("Karnataka");
		address.setPincode("560028");
		user.setAddress(address);
		
		Address homeAddress= new Address();

		homeAddress.setCity("Visakhapatnam");
		homeAddress.setStreet("MVP colony");
		homeAddress.setState("Andhra Pradesh");
		homeAddress.setPincode("535002");
		
		user.setHomeAdress(homeAddress);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

}
