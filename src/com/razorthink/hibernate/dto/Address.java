package com.razorthink.hibernate.dto;

import javax.persistence.Embeddable;

/**
 * This address class is embeddable class which have seperate data members, but
 * these data members are used as the userdetails database columns
 * 
 * @author umesh
 * 
 * @since 12-08-2016
 *
 */

@Embeddable
public class Address {

	private String street;
	private String city;
	private String state;
	private String pincode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
