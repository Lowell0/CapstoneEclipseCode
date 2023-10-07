package com.bfpoms.bfpoms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "db_user")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int account_no;
	private String firstname;
	private String lastname;
	private String password;
	private String address;
	private String designation;
	private String email;
	private String position;
	private String status;
	
	//Constructor
	
	public UserEntity() {}
	public UserEntity(int id, int account_no, String firstname, String lastname, String password, String address,
			String designation, String email, String position, String status) {
		super();
		this.id = id;
		this.account_no = account_no;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.address = address;
		this.designation = designation;
		this.email = email;
		this.position = position;
		this.status = status;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	//public void setId(int id) {
		//this.id = id;
	//}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
