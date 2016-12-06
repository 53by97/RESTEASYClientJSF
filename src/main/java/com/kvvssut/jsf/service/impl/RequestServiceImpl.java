package com.kvvssut.jsf.service.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import com.kvvssut.service.ClientRestService;

@Stateless
public class RequestServiceImpl{

	@Inject
	private ClientRestService clientRestService;

	public String getBalance(String username) {
		Response response =	this.clientRestService.doRestDemoCall(username);

		System.out.println(response.getEntity().toString());

		if(response.getStatus() == 200){
			return "success";
		} else {
			return "failure";
		}
	}
}
