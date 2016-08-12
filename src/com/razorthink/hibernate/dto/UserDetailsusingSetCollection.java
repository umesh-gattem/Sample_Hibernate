package com.razorthink.hibernate.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
public class UserDetailsusingSetCollection {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@ElementCollection
	private Set<Address> listofAddresses= new HashSet<Address>();
	
	public Set<Address> getListofAddresses() {
		return listofAddresses;
	}

	public void setListofAddresses(Set<Address> listofAddresses) {
		this.listofAddresses = listofAddresses;
	}

	private String description;
	@Temporal(TemporalType.DATE)
	private Date joinDate;

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
