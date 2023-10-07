package com.bfpoms.bfpoms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewbpApprovedApplicationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int newbp_id;
	
	private int bspermit_no;
	private String permittee;
	private String business_name;
	private String address;
	private String nature_business;
	private String type_occupancy;
	private String contact_no;
	private int fsic_no;
	private String fsic_date;
	private String remarks;
	
	//constructor
	public NewbpApprovedApplicationEntity() {}

	public NewbpApprovedApplicationEntity(int newbp_id, int bspermit_no, String permittee, String business_name,
			String address, String nature_business, String type_occupancy, String contact_no, int fsic_no,
			String fsic_date, String remarks) {
		super();
		this.newbp_id = newbp_id;
		this.bspermit_no = bspermit_no;
		this.permittee = permittee;
		this.business_name = business_name;
		this.address = address;
		this.nature_business = nature_business;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.fsic_no = fsic_no;
		this.fsic_date = fsic_date;
		this.remarks = remarks;
	}

	//getters and setters
	public int getNewbp_id() {
		return newbp_id;
	}

	//public void setNewbp_id(int newbp_id) {
		//this.newbp_id = newbp_id;
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

	public int getFsic_no() {
		return fsic_no;
	}

	public void setFsic_no(int fsic_no) {
		this.fsic_no = fsic_no;
	}

	public String getFsic_date() {
		return fsic_date;
	}

	public void setFsic_date(String fsic_date) {
		this.fsic_date = fsic_date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	
	
	
	

}
