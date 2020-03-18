package org.java201913.springboot_web_huitao.service;

import java.util.List;


import org.java201913.springboot_web_huitao.mapper.UserMapper;
import org.java201913.springboot_web_huitao.pojo.User;
import org.java201913.springboot_web_huitao.pojo.UserExample;
import org.java201913.springboot_web_huitao.pojo.UserExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserMapper um;
	
	public List<User> login(User u){
		UserExample ue =new UserExample();
		Criteria c=ue.createCriteria();
		//基于用户名密码查询能否得到对象
		c.andUsernameEqualTo(u.getUsername());
		c.andUserpassEqualTo(u.getUserpass());
		return um.selectByExample(ue);
	}
}
