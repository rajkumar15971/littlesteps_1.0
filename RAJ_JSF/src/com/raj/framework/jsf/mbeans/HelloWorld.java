package com.raj.framework.jsf.mbeans;

import javax.faces.bean.ManagedBean ;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "helloWorld", eager = true )
@SessionScoped
public class HelloWorld {
	String message = null ; 
	public HelloWorld ( ) {
		System.out.println( "HelloWorld started!" ); 
	} 
	public String getMessage ( ) { 
		return "Hello JSF World!";
	} 
	public void setMessage(String message) { 
		this.message = message; 
	}
	public String moveToRegistration(){
		return "Registration";
	}
	public String moveToLogin(){
		return "Login";
	}
}