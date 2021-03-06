package org.ccnu.nercel.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
*@author xiaotong              
*@version ${date} ${time}                  
*/                  

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {		
		return "index";	
	}
	
	@PostMapping("/quesubmit")
	public String quesubmit(Model model,ArrayList<String> item) {
		
		return "quesdone";		
	}
	
	@RequestMapping("/readingtest")
	public String readingtest() {		
		return "readingtest";	
	}

}