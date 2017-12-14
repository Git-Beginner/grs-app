package com.reimbursment.service;

import com.reimbursment.model.User;

public interface IAuthenticationService {
	
	public User authenticate(String userName, String password);
}
