package com.bfpoms.bfpoms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tbl_bplo")
public class BploExcelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int permit_no;
	private String date_operated;
	private String date_assessed;
	private String business_name;
	private String corp_name;
	private String address;
	private String barangay;
	private String station_aor;
	private String name_owner;
	private String line_of_business;
	private String nature_of_business;
	
	//constructor
	public BploExcelEntity() {}

	public BploExcelEntity(int id, int permit_no, String date_operated, String date_assessed, String business_name,
			String corp_name, String address, String barangay, String station_aor, String name_owner,
			String line_of_business, String nature_of_business) {
		super();
		this.id = id;
		this.permit_no = permit_no;
		this.date_operated = date_operated;
		this.date_assessed = date_assessed;
		this.business_name = business_name;
		this.corp_name = corp_name;
		this.address = address;
		this.barangay = barangay;
		this.station_aor = station_aor;
		this.name_owner = name_owner;
		this.line_of_business = line_of_business;
		this.nature_of_business = nature_of_business;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	//public void setId(int id) {
		//this.id = id;
	//}

	public int getPermit_no() {
		return permit_no;
	}

	public void setPermit_no(int permit_no) {
		this.permit_no = permit_no;
	}

	public String getDate_operated() {
		return date_operated;
	}

	public void setDate_operated(String date_operated) {
		this.date_operated = date_operated;
	}

	public String getDate_assessed() {
		return date_assessed;
	}

	public void setDate_assessed(String date_assessed) {
		this.date_assessed = date_assessed;
	}

	public String getBusiness_name() {
		return business_name;
	}

	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}

	public String getCorp_name() {
		return corp_name;
	}

	public void setCorp_name(String corp_name) {
		this.corp_name = corp_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBarangay() {
		return barangay;
	}

	public void setBarangay(String barangay) {
		this.barangay = barangay;
	}

	public String getStation_aor() {
		return station_aor;
	}

	public void setStation_aor(String station_aor) {
		this.station_aor = station_aor;
	}

	public String getName_owner() {
		return name_owner;
	}

	public void setName_owner(String name_owner) {
		this.name_owner = name_owner;
	}

	public String getLine_of_business() {
		return line_of_business;
	}

	public void setLine_of_business(String line_of_business) {
		this.line_of_business = line_of_business;
	}

	public String getNature_of_business() {
		return nature_of_business;
	}

	public void setNature_of_business(String nature_of_business) {
		this.nature_of_business = nature_of_business;
	}

	
	
	
}
