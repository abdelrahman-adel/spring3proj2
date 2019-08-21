package com.master.spring.spring3proj2.login;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.master.spring.spring3proj2.services.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService service;

	private Logger logger = LogManager.getLogger(this.getClass());

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		logger.info("Now i'm in showLoginPage()");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String username, @RequestParam String password, ModelMap modelMap) {
		logger.info("Now i'm in handleLoginRequest()");
		logger.info("username: " + username);
		logger.info("password: " + password);

		if (service.isUserValid(username, password)) {
			modelMap.put("username", username);
			modelMap.put("password", password);
			return "welcome";
		}

		modelMap.put("errorMessage", "Wrong credentials !!");
		return "welcome";
	}

	@RequestMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		logger.info("Now i'm in hello()");
		String htmlHello = "";
		htmlHello += "<html>";
		htmlHello += "<head/>";
		htmlHello += "<body>";
		htmlHello += "<h1>Hello World</h1>";
		htmlHello += "</body>";
		htmlHello += "</html>";
		return htmlHello;
	}
}
