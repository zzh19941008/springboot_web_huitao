package org.java201913.springboot_web_huitao.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.java201913.springboot_web_huitao.mapper.ShopMapper;
import org.java201913.springboot_web_huitao.pojo.Shop;
import org.java201913.springboot_web_huitao.pojo.ShopExample;
import org.java201913.springboot_web_huitao.pojo.ShopExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {

	@Autowired
	private ShopMapper sm;
	
	public List<Shop> showAll(int page,int pagesize){
		//offset:起点下标
		//limit:取几个，包含起点下标对应的

		RowBounds rb=new RowBounds((page-1)*pagesize,pagesize);
		return sm.selectByExampleWithRowbounds(null, rb);
	}
	
	public long counts(){
		return sm.countByExample(null);
	}
	
	//基于code查询
	public List<Shop> showByCode(String code){
		ShopExample se =new ShopExample();
		Criteria c=se.createCriteria();
		c.andScodeEqualTo(code);
		return sm.selectByExample(se);
		
	}
}
