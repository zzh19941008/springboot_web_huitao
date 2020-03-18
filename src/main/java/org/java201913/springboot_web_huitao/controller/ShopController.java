package org.java201913.springboot_web_huitao.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.java201913.springboot_web_huitao.pojo.Shop;
import org.java201913.springboot_web_huitao.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("shop")
public class ShopController {

	@Autowired
	private ShopService ss;
	
	@RequestMapping("showAll")
	public String showAll(int page,HttpServletRequest request){
		int pagesize=20;
		
		List<Shop> list=ss.showAll(page,pagesize);
		//总条数
		long counts =ss.counts();
		
		//需要给下一个页面传——请求转发
		request.setAttribute("page", page);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("counts", counts);
		request.setAttribute("list", list);
		return "index";
	}
	
	//showByCodeAjax
	@RequestMapping("showByCodeAjax")
	@ResponseBody
	public  String showByCodeAjax(String code,String username){
		System.out.println(code+username);
		List<Shop> list =ss.showByCode(code);
		if(list.isEmpty()){
			//不存在
			return "商品编号未存在，允许使用";
		}else{
			return "商品编号存在，请更换";
			//已存在
		}
		
	}
}
