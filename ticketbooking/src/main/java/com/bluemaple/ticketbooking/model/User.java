package com.bluemaple.ticketbooking.model;

public class User {
	
	private String username;
	private String password;
	private String temp_pass;
	private String first_name;
	private String last_name;
	private String emailaddress;
	private String address;
	private String user_role;
	public User(){};
	
	
	
	
	public User(String username, String password, String temp_pass,
			String first_name, String last_name, String emailaddress,
			String address,String user_role) {
		
		
		this.username = username;
		this.password = password;
		this.temp_pass = temp_pass;
		this.first_name = first_name;
		this.last_name = last_name;
		this.emailaddress = emailaddress;
		this.address = address;
		this.user_role=user_role;
	}




	


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTemp_pass() {
		return temp_pass;
	}
	public void setTemp_pass(String temp_pass) {
		this.temp_pass = temp_pass;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}




	public String getUser_role() {
		return user_role;
	}




	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	
}
