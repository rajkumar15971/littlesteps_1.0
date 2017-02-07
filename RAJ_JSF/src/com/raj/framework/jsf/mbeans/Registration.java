package com.raj.framework.jsf.mbeans;
import javax.faces.bean.ManagedBean ;
import javax.faces.bean.SessionScoped;
import java.io.Serializable ;
@ManagedBean(name = "registration", eager = true )
@SessionScoped
public class Registration {
private String fname;
private String lname;
private String email;

public Registration(){
	
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String moveToLogin(){
	return "Login";
}

public String moveToHOme(){
	return "home";
}

}
