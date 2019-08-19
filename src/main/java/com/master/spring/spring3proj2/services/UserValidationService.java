package com.master.spring.spring3proj2.services;

public class UserValidationService {

	public boolean isUserValid(String username, String password) {
		if (username.equals("abdo") && password.equals("123")) {
			return true;
		}
		return false;
	}

}
