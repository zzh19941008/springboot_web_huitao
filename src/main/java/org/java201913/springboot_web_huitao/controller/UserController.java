package org.java201913.springboot_web_huitao.controller;

import java.util.List;

import org.java201913.springboot_web_huitao.pojo.User;
import org.java201913.springboot_web_huitao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService us;
	
	@RequestMapping("loginAjax")
	@ResponseBody
	public Integer loginAjax(User u){
		
		List<User> list =us.login(u);
		if(list.isEmpty()){
			return 0;
		}else{
			return 1;
		}
		
	}
}
