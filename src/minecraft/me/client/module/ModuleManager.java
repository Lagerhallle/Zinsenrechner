package me.client.module;

import java.util.ArrayList;

public class ModuleManager {

	
	
	public static ArrayList<Module> activeModules = new ArrayList<Module>();
	
	
	
	public ModuleManager() {
		this.activeModules.add(new ModuleGui());
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static ArrayList<Module> getModules() {
		return activeModules;
	}
	
	public Module getModule(Class<? extends Module> clazz) {
		for (Module mod : getModules()) {
			if (mod.getClass() == clazz) {
				return mod;
			}
		}
		return null;
}
	
}

