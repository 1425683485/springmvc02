package com.zhidi.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private int id;
	private String name;
	private String sex;
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", date="
				+ date + "]";
	}
	
	
	
}
