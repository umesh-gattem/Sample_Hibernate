package com.razorthink.hibernate.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * This is the POJO method for the UserDetails table with the members like id, name, address, date, description
 * 
 * @author umesh
 * 
 * @since 11-08-2016
 * 
 */

@Entity(name = "user_details")
public class UserDetailsUsingAttributeOverride {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@Embedded
	private Address address;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="Home_street")),
		@AttributeOverride(name="city", column=@Column(name="Home_city")),
		@AttributeOverride(name="state", column=@Column(name="Home_state")),
		@AttributeOverride(name="pincode", column=@Column(name="Home_pincode"))
	})
	private Address homeAdress;
	public Address getHomeAdress() {
		return homeAdress;
	}

	public void setHomeAdress(Address homeAdress) {
		this.homeAdress = homeAdress;
	}

	private String description;
	@Temporal(TemporalType.DATE)
	private Date joinDate;

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}