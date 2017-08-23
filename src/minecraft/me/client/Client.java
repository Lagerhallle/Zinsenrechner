package me.client;

import javax.swing.JDialog;

import me.client.gui.Gui;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Client {

	
	
	public static void runClient() {
		//init Gui
		 
		
			Gui dialog = new Gui(); 
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(false);
		
		
		
		
	}
}
