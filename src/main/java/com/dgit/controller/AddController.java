package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddController {
	private static final Logger logger=LoggerFactory.getLogger(AddController.class);
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String getAdd(){
		logger.info("add get");
		
		return "addForm";
	}
	
	@RequestMapping(value="add", method=RequestMethod.POST)
	public String postAdd(@ModelAttribute("num1") double num1, @ModelAttribute("num2") double num2, Model model){
		logger.info("add post");
		double rs=num1+num2;
		model.addAttribute("rs",rs);	
		
		return "addResult";
	}
}
