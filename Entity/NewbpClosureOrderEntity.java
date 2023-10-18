package com.bfpoms.bfpoms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "tbl_newbpclosureorder")
public class NewbpClosureOrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int newco_id;
	
	private int bspermit_no;
	private String permittee;
	private String business_name;
	private String address;
	private String nature_business;
	private String type_occupancy;
	private String contact_no;
	private String administrative_fine;
	private String status;
	
	//constructor
	public NewbpClosureOrderEntity() {}

	public NewbpClosureOrderEntity(int newco_id, int bspermit_no, String permittee, String business_name,
			String address, String nature_business, String type_occupancy, String contact_no,
			String administrative_fine, String status) {
		super();
		this.newco_id = newco_id;
		this.bspermit_no = bspermit_no;
		this.permittee = permittee;
		this.business_name = business_name;
		this.address = address;
		this.nature_business = nature_business;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.administrative_fine = administrative_fine;
		this.status = status;
	}

	//getters and setters
	public int getNewco_id() {
		return newco_id;
	}

	//public void setNewco_id(int newco_id) {
		//this.newco_id = newco_id;
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

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getAdministrative_fine() {
		return administrative_fine;
	}

	public void setAdministrative_fine(String administrative_fine) {
		this.administrative_fine = administrative_fine;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
