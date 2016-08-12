package com.razorthink.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.razorthink.hibernate.dto.UserDetails;
import com.razorthink.hibernate.dto.Vehicle;

/**
 * This class shows how to insert data into the data into the database.
 * session.save() method is used to insert data into database.
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

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Verna Car");
		
		user.setVehicle(vehicle);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
	}

}
