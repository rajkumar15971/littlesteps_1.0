package com.raj.framework.jsf.mbeans;

import java.io. Serializable ;
import javax.faces.bean. ManagedBean ;
import javax.faces.bean. ManagedProperty ;
import javax.faces.bean. RequestScoped ;

@ManagedBean(name = "navigationController" , eager = true)
@RequestScoped

public class NavigationController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value= "#{param.pageId}" )
	private String pageId;
	
	public String getPageId() {
		return pageId;
	}
	
	public void setPageId( String pageId) {
		this.pageId = pageId;
	}
	
	public String showPage(){
		System.out.println("Entered into NavigationController.showPage ::>> pageId ::>> " + pageId );
		String retStr = null ;
		
		if(pageId.equals( "1" )){
			retStr = "Login" ;
		}
		else if(pageId.equals( "2" )){
			retStr = "Registration" ;
		}
		else if(pageId.equals( "3" )){
			retStr = "Page1" ;
		}
		else if(pageId.equals( "4" )){
			retStr = "Page2" ;
		}
		else{
			retStr = "home";
		}
		
		System.out.println("Exited from NavigationController.showPage ");
		return retStr ;
	}
	public String goToPage1(){
		return "Page1";
	}
	public String goToPage2(){
		return "Page2";
	}

}
