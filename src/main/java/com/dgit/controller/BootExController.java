package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootExController {

	private static final Logger logger=LoggerFactory.getLogger(BootExController.class);
	
	@RequestMapping("/test1")
	public String test1(){
		logger.info("test1");
		return "03_06example";
	} 
}
