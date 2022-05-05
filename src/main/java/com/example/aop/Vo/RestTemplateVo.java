package com.example.aop.Vo;

import java.util.List;

import com.example.aop.entity.Company;

public class RestTemplateVo {
	private User user;
	private Company company;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public RestTemplateVo(User user, Company company) {
		super();
		this.user = user;
		this.company = company;
	}
	public RestTemplateVo() {
		super();
	}
	

	

}
