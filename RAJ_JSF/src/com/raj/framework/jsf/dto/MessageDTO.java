package com.raj.framework.jsf.dto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "messageDTO", eager = true )
@SessionScoped
public class MessageDTO {

	String message = null ;
	
	public String getMessage ( ) {
		return "Hello JSF World!";
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}