package com.example.aop.Vo;

import java.util.List;

public class RestAll {
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public RestAll(List<User> users) {
		super();
		this.users = users;
	}

	public RestAll() {
		super();
	}
	

}
