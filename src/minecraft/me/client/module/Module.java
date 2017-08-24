package me.client.module;


public class Module {

	private int bind;
	private String name;
	private boolean status;
	
	
	public Module(String name, int bind) {
		
		this.name = name;
		this.bind = bind;
	}
	

	
	
	public String getName() {
		return name;
	}
	
	public int getBind() {
		return bind;
		
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
