package com.bellinfo.spring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

public class LoginCredentials {
	@Override
	public String toString() {
		return "LoginCredentials [name=" + name + ", password=" + password + "]";
	}
	
	String name;
	
	String password;
	
	
	
	public LoginCredentials(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	
	public LoginCredentials() {
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
