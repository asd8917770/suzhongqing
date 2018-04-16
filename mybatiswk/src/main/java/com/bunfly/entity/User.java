package com.bunfly.entity;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String sex;
	public User() {
		
	}
	public User( String username, String password, String sex) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String username) {
		this.username = username;
	}
	public String getPwd() {
		return password;
	}
	public void setPwd(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" +password + ", sex=" + sex + "]";
	}
}
