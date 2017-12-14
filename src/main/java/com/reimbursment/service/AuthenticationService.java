package com.reimbursment.service;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import com.reimbursment.model.User;

import static com.reimbursement.database.Database.*;

@Service
public class AuthenticationService implements IAuthenticationService{

	@Override
	public User authenticate(String userName, String password) {
		if(usersMap.get(userName) == null)
			throw new BadCredentialsException("Username not found");
		else{
			User u = usersMap.get(userName);
			if(password != null && password.equals(u.getPassword())){
				return u;
			}else{
				throw new BadCredentialsException("Incorrect not found");
			}
		}
		
	}

}
