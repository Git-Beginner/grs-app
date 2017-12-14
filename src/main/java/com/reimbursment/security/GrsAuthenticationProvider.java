package com.reimbursment.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.reimbursment.model.User;
import com.reimbursment.service.IAuthenticationService;


@Component
public class GrsAuthenticationProvider implements AuthenticationProvider {
 
	@Autowired
	private IAuthenticationService authService;
	
    @Override
    public Authentication authenticate(Authentication authentication) 
      throws AuthenticationException {
        String userName = authentication.getName();
        String password = authentication.getCredentials().toString();
        User user = authService.authenticate(userName, password);
        if (user != null) {
            return new UsernamePasswordAuthenticationToken(
            		userName, password, new ArrayList());
        } else {
            throw new BadCredentialsException("Invalid Login");
        }
    }
 
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(
          UsernamePasswordAuthenticationToken.class);
    }
}