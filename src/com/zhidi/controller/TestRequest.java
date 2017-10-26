package com.zhidi.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhidi.entity.User;

@Controller
@RequestMapping("/reqp")
public class TestRequest {

	
	@RequestMapping("/index")
	public String testResquest(HttpServletRequest req){
		req.setAttribute("username", "张三");
		return "index";
	}
	@RequestMapping("/byresp")
	public void testByResp(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json;UTF-8");
		PrintWriter writer = resp.getWriter();
		writer.print("{\"username\":\"张三\",\"age\":18}");
		writer.flush();
		writer.close();
	}
	
	//相当于request
	@RequestMapping("/byModel")
	public String byModel(Model model){
		model.addAttribute("usernam", "张三");
		return "index";
	}
	
	@RequestMapping("/byModelMap")
	public String byModelMapping(ModelMap mm){
		mm.addAttribute("userna", "李四");
		return "index";
	}
	
	@RequestMapping("/bySession")
	public String bySession(HttpServletRequest req){
		HttpSession session = req.getSession();
		session.setAttribute("user", "张三");
		return "index";
	}
	
	@RequestMapping("/string")
	public String testString(String username){
		System.out.println(username);
		return "index";
	}
	
	@RequestMapping("/integer")
	public String testInteger(Integer id){
		System.out.println(id);
		return "index";
	}
	
	@RequestMapping("/pojo")
	public String testPojo(User user){
		System.out.println(user);
		return "index";
	}
	
	//@RequestParam注解的使用
	@RequestMapping("/param")
	public String testParam(@RequestParam(value="id",defaultValue="10") Integer id){
		System.out.println(id);
		return "index";
	}
	
	@RequestMapping("/toParam")
	public String testToParam(){
		return "param";
	}
	
	@RequestMapping("/dateParam")
	public String testParam(User user){
		System.out.println(user);
		return "index";
	}
	
	@RequestMapping("/{data},{sex}/urlParam/{name}")
	public String testUrlParam(@PathVariable("data") String data,
								@PathVariable("name") String name,
								@PathVariable("sex") String sex
		){
		System.out.println(name);
		System.out.println(data);
		System.out.println(sex);
		return "index";
	}
}
