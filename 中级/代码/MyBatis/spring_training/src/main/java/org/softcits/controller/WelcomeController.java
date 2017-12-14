package org.softcits.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/springmvc")
public class WelcomeController  {

	@RequestMapping(value={"/we","/wel"})
	//jsp -> controller 使用方法形参即可
	//controller -> jsp
	public String welcome(String username, Model model){
		System.out.println("welcome方法被调用了");
		System.out.println("欢迎: " + username + " 登录系统!");
		
		model.addAttribute("uname", username);
		
/*		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", new String("alex"));*/
		
		return "welcome";
	}
	
	@RequestMapping(value={"/","/hello","/he"})
	public String hello(){
		System.out.println("hello方法被调用了");
		return "hello";
	}
	
	// /welcome/alex
	@RequestMapping(value="/welcome/{username}")
	public String welcome2(@PathVariable String username, Model model){
		
		model.addAttribute("uname", username);
		
		return "welcome";
	}
	
}
