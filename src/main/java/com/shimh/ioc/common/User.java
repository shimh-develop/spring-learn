package com.shimh.ioc.common;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class User {
	private Integer id;
	
	private String name;

	private String sex;
	
	private String[] hobbies;
	
	private Date createTime;
	
	private Map<String,String> maps = new HashMap<String, String>();

	public User() {
	}

	public User(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + ", createTime="
//				+ createTime + ", maps=" + maps + "]";
//	}

	
	
}
