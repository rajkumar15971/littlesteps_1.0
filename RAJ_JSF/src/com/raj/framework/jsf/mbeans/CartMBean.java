package com.raj.framework.jsf.mbeans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean ;
import javax.faces.bean.SessionScoped;

import com.raj.framework.jsf.dto.Item;

@ManagedBean(name = "cartMBean", eager = true )
@SessionScoped

public class CartMBean {
	private ArrayList<Item> items= null;
	private double total=100;
	
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public void createItems(){
		items= new ArrayList<Item>(10);
		for(int i=0;i<10;i++){

			Item item = new Item("description"+i,i);

			items.add(item);
		}
	}

	public CartMBean() {
		createItems();
	}


}
