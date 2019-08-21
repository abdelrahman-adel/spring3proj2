package com.master.spring.spring3proj2.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	private Logger logger = LogManager.getLogger(this.getClass());

	@PostConstruct
	public void postConstruct() {
		logger.info("Now i'm in postConstruct()");
	}

	public boolean isUserValid(String username, String password) {
		logger.info("Now i'm in isUserValid()");
		if (username.equals("abdo") && password.equals("123")) {
			return true;
		}
		return false;
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("Now i'm in preDestroy()");
	}

}
