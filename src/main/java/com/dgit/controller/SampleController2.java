package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	public String doC(Model model){
		//logger.info("doC가 실행됩니다.");
		model.addAttribute("msg", "result글자 입니다.");//req.setAttribute("msg","result글자 입니다.");와 똑같음
		model.addAttribute("test", "test 입니다.");
		
		return "result";
	}
	
	@RequestMapping("doD")
	public String doD(String msg, Model model){
		logger.info("doD가 실행됩니다.");
		logger.info("msg="+msg);
		
		model.addAttribute("msg", msg);
	
		return "result2";
	}
	
	@RequestMapping("doE")
	public String doE(@ModelAttribute("msg") String msg){
		logger.info("doE가 실행됩니다.");
		
		return "result2";
	}
	
	@RequestMapping("doE2")
	public String doE2(@ModelAttribute("msg") int msg){
		logger.info("doE가 실행됩니다.");
		
		return "result2";
	}
	
}






