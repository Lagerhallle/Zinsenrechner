package me.client.module;

import com.ibm.icu.util.ULocale.Category;

public class Module {

	private int bind;
	private String name;
	private Category cat;
	private boolean status;
	
	
	public Module(String name, int bind, Category cat) {
		
		this.name = name;
		this.bind = bind;
		this.cat = cat;	
	}
	
	
	public Module(String name, Category cat) {
		
		this.name = name;
		this.cat = cat;	
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public int getBind() {
		return bind;
		
	}
	
	public Category getCategory() {
		return cat;
	}
	
	
	public boolean getStatus() {
		return status;
	}
	
	
	public void toggleMoudle() {
		if(status) {
			onDisable();
			status = false;
		}
		else {
			onEnable();
			status = true;
		}
	}




	private void onDisable() {
		
		
	}




	private void onEnable() {
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
