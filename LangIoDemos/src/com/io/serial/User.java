package com.io.serial;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String username;
	private transient int userId;
	private String city;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, int userId, String city) {
		super();
		this.username = username;
		this.userId = userId;
		this.city = city;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userId=" + userId + ", city=" + city + "]";
	}
	
	
}
