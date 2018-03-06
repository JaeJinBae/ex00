package com.dgit.controller;


import java.io.Console;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dgit.domain.ProductVO;

@Controller
public class SampleController3 {
	private static final Logger logger=LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("productA")
	public String productA(Model model){
		logger.info("productA 가 실행됩니다.");
		ProductVO vo=new ProductVO("Sample Product", 10000);
		model.addAttribute("vo",vo);
		return "productA"; 
	}
	
	@RequestMapping("productList")
	public String productList(Model model){
		logger.info("productList가 실행됩니다.");
		
		ArrayList<ProductVO> list=new ArrayList<>();
		list.add(new ProductVO("오징어 짬뽕", 1500));
		list.add(new ProductVO("안성탕면", 1200));
		list.add(new ProductVO("진라면", 3500));
		list.add(new ProductVO("삼양라면", 2500));
		
		model.addAttribute("list",list);
		return "productList";				
	}
	
	@RequestMapping("doF")
	public String redirectTest(){
		logger.info("doF가 실행됩니다.");
		return "redirect:productA";
	}
	
	@RequestMapping("doG")
	public String forwardTest(){
		logger.info("doG가 실행됩니다.");
		return "forward:productList";
	}
	
	@RequestMapping("doJson")
	public @ResponseBody ProductVO doJson(){
		logger.info("doJson이 실행됩니다.");
		
		ProductVO vo=new ProductVO("바나나우유", 700);
		return vo;
	}
}









