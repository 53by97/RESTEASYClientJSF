package com.kvvssut.jsf.bean;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.kvvssut.jsf.service.RequestService;
import com.kvvssut.jsf.service.impl.RequestServiceImpl;

@Stateless
public class RequestBean {
	
	@Inject
	private RequestService requestService;
	
	private String username;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getBalance() {
		System.out.println("All Done!!");
		RequestServiceImpl impl = new RequestServiceImpl();
		System.out.println(requestService + " " + impl);
		return impl.getBalance(username);
	}

	@Override
	public String toString() {
		return "RequestBean [username=" + username + ", message=" + message
				+ "]";
	}
	
}
