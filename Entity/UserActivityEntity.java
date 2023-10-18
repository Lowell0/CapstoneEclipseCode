package com.bfpoms.bfpoms.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserActivityEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String activity_description;
	private LocalDateTime timestamp;
	
	
	//constructor
	public UserActivityEntity() {}


	public UserActivityEntity(int id, String activity_description, LocalDateTime timestamp) {
		super();
		this.id = id;
		this.activity_description = activity_description;
		this.timestamp = timestamp;
	}


	public int getId() {
		return id;
	}


	//public void setId(int id) {
		//this.id = id;
	//}


	public String getActivity_description() {
		return activity_description;
	}


	public void setActivity_description(String activity_description) {
		this.activity_description = activity_description;
	}


	public LocalDateTime getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
