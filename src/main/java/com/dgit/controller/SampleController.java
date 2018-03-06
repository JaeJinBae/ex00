package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public void doA(){
		//System.out.println("doA가 실행되었습니다.");
		logger.info("doA가 실행되었습니다.");
	}
	
	@RequestMapping("doB")
	public String doB(){
		//System.out.println("doB가 실행되었습니다."); 
		logger.info("doB가 실행되었습니다.");
		return "doA";
	}
}
