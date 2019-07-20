package com.uuh.springbootinstance.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * Description: HelloWorld
 * Date: 2019年07月21日 0:44
 * Author: cg
 * Version: 1.0
 */
@Controller
public class HelloWorld {

	@RequestMapping(value = "/hello")
	public String hello(Model model) throws Exception {
		model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
		if(true){
			throw new Exception("some exception");
		}
		return "hello";
	}
}
