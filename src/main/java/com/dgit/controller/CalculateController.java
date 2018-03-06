package com.dgit.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dgit.domain.BMICalculator;
import com.dgit.domain.MyInfo;

@Controller
public class CalculateController {
	private static final Logger logger=LoggerFactory.getLogger(CalculateController.class);
	
	@Autowired
	BMICalculator bmi;
	
	@RequestMapping(value="cal", method=RequestMethod.GET)
	public String getType(){
		logger.info("state: get");
		
		return "myInfoForm";
	}
	
	@RequestMapping(value="cal", method=RequestMethod.POST)
	public String postType(@ModelAttribute("name") String name,@ModelAttribute("height") double height,@ModelAttribute("weight") double weight, @ModelAttribute("hobbys") String[] hobbys,Model model ){
		logger.info("state: post");
		
		ArrayList<String> str=new ArrayList<>();
		
		for(int i=0;i<hobbys.length;i++){
			str.add(hobbys[i]);
		}
		
		MyInfo mi=new MyInfo();
		mi.setBmiCalculator(bmi);
		mi.setName(name);
		mi.setHeight(height);
		mi.setWeight(weight);
		mi.setHobbys(str);
		model.addAttribute("bmi",mi.getInfo());
		
		return "myInfoResultForm";
	}
}
