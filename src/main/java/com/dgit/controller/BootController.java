package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootController {
	private static final Logger logger=LoggerFactory.getLogger(BootController.class);
	
	@RequestMapping("/boot_grid")
	public String bootGrid(){
		logger.info("boot_grid");
		return "boot_grid";
	}
	
	@RequestMapping("/boot_grid2")
	public String bootGrid2(){
		logger.info("boot_grid2");
		return "boot_grid2";
	}
	
	@RequestMapping("/bootTable")
	public String bootTable(){
		logger.info("bootTable");
		return "bootTable";
	}
	
	@RequestMapping("/boot_form")
	public String boot_form(){
		logger.info("boot_form");
		return "boot_form";
	}
}
