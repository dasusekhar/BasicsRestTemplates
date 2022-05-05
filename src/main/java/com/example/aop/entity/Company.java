package com.example.aop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Company {
	@Id
	private long companyId;
	private String address;
	private String status;
	private  int id;
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Company(long companyId, String address, String status, int id) {
		super();
		this.companyId = companyId;
		this.address = address;
		this.status = status;
		this.id = id;
	}
	public Company() {
		super();
	}
	
	
	
	

}
