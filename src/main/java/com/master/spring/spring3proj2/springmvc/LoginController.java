package com.master.spring.spring3proj2.springmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/login")
	public String gotoLogin() {
		logger.info("Now i'm in gotoLogin()");
		return "login";
	}

	@RequestMapping(value = "/gotohello")
	public String gotoHello() {
		logger.info("Now i'm in gotoHello()");
		return "hello";
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
