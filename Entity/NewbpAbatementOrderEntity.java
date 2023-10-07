package com.bfpoms.bfpoms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewbpAbatementOrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int newao_id;
	
	private int bspermit_no;
	private String permittee;
	private String business_name;
	private String address;
	private String nature_business;
	private String type_occupancy;
	private String administrative_fine;
	private int status;
	
	//constructor
	public NewbpAbatementOrderEntity() {}

	public NewbpAbatementOrderEntity(int newao_id, int bspermit_no, String permittee, String business_name,
			String address, String nature_business, String type_occupancy, String administrative_fine, int status) {
		super();
		this.newao_id = newao_id;
		this.bspermit_no = bspermit_no;
		this.permittee = permittee;
		this.business_name = business_name;
		this.address = address;
		this.nature_business = nature_business;
		this.type_occupancy = type_occupancy;
		this.administrative_fine = administrative_fine;
		this.status = status;
	}

	//getters and setters
	public int getNewao_id() {
		return newao_id;
	}

	//public void setNewao_id(int newao_id) {
		//this.newao_id = newao_id;
	//}

	public int getBspermit_no() {
		return bspermit_no;
	}

	public void setBspermit_no(int bspermit_no) {
		this.bspermit_no = bspermit_no;
	}

	public String getPermittee() {
		return permittee;
	}

	public void setPermittee(String permittee) {
		this.permittee = permittee;
	}

	public String getBusiness_name() {
		return business_name;
	}

	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNature_business() {
		return nature_business;
	}

	public void setNature_business(String nature_business) {
		this.nature_business = nature_business;
	}

	public String getType_occupancy() {
		return type_occupancy;
	}

	public void setType_occupancy(String type_occupancy) {
		this.type_occupancy = type_occupancy;
	}

	public String getAdministrative_fine() {
		return administrative_fine;
	}

	public void setAdministrative_fine(String administrative_fine) {
		this.administrative_fine = administrative_fine;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}
