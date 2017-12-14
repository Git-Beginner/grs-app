package com.reimbursment.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String userName;
	private String password;
	private List<String> privileges;
	
	public User(String userName, String password, List<String> privileges) {
		super();
		this.userName = userName;
		this.password = password;
		this.privileges = privileges;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getPrivileges() {
		if(privileges == null)
			privileges = new ArrayList<String>();
		return privileges;
	}
	
}
