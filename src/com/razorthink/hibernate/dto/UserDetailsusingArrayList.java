package com.razorthink.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


/**
 * This is the POJO method for the UserDetails using arraylist for the address attribute
 * 
 * @author umesh
 * 
 * @since 11-08-2016
 * 
 */

@Entity(name = "user_details")
public class UserDetailsusingArrayList {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@ElementCollection
	@JoinTable(name="User_Address" ,joinColumns=@JoinColumn(name="User_Id"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name="Address_id") }, generator = "hilo-gen", type = @Type(type = "long"))
	private Collection<Address> listofAddresses= new ArrayList<Address>();
	
	public Collection<Address> getListofAddresses() {
		return listofAddresses;
	}

	public void setListofAddresses(Collection<Address> listofAddresses) {
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
