package com.raj.framework.jsf.mbeans;

import javax.faces.bean.ManagedBean ;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "loginBean", eager = true )
@SessionScoped
public class LoginMBean {
private String userName;
private String passWord;


public LoginMBean(){
	
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassWord() {
	return passWord;
}

public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String moveToHome(){
	return "home";
}
public String moveToRegestration(){
	return "Registration";
}
}
