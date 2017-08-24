package me.client.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import me.client.module.Module;
import me.client.module.ModuleManager;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui extends JDialog {

	private JPanel contentPanel = new JPanel();
	private JTextField Value_0 = new JTextField();
	private JTextField Value_1 = new JTextField();
	private JTextField Value_2 = new JTextField();
	private JTextField Value_3 = new JTextField();
	private JTextField Value_4 = new JTextField();
	private JTextField Value_5 = new JTextField();
	private JTextField Value_6 = new JTextField();
	private JTextField Value_7 = new JTextField();
	private JTextField Value_8 = new JTextField();
	private JTextField Bind_0 = new JTextField();
	private JTextField Bind_1 = new JTextField();
	private JTextField Bind_2 = new JTextField();
	private JTextField Bind_3 = new JTextField();
	private JTextField Bind_4 = new JTextField();
	private JTextField Bind_5 = new JTextField();
	private JTextField Bind_6 = new JTextField();
	private JTextField Bind_7 = new JTextField();
	private JTextField Bind_8 = new JTextField();
	

	/**
	 * Create the dialog.
	 */
	public Gui() {
		
		
		for(final Module m : ModuleManager.activeModules) {
			/*
		  	### Binds ###
		 					*/
			setBounds(100, 100, 811, 512);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBackground(new Color(204, 0, 51));
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
		Bind_0 = new JTextField();
		Bind_0.setBounds(624, 8, 86, 20);
		contentPanel.add(Bind_0);
		Bind_0.setColumns(10);
		
		
		Bind_1 = new JTextField();
		Bind_1.setColumns(10);
		Bind_1.setBounds(624, 36, 86, 20);
		contentPanel.add(Bind_1);
		
		Bind_2 = new JTextField();
		Bind_2.setColumns(10);
		Bind_2.setBounds(624, 64, 86, 20);
		contentPanel.add(Bind_2);
		
		Bind_3 = new JTextField();
		Bind_3.setColumns(10);
		Bind_3.setBounds(624, 93, 86, 20);
		contentPanel.add(Bind_3);
		
		Bind_4 = new JTextField();
		Bind_4.setColumns(10);
		Bind_4.setBounds(624, 120, 86, 20);
		contentPanel.add(Bind_4);
		
		Bind_5 = new JTextField();
		Bind_5.setColumns(10);
		Bind_5.setBounds(624, 149, 86, 20);
		contentPanel.add(Bind_5);
		
		Bind_6 = new JTextField();
		Bind_6.setColumns(10);
		Bind_6.setBounds(624, 177, 86, 20);
		contentPanel.add(Bind_6);
		
		Bind_7 = new JTextField();
		Bind_7.setColumns(10);
		Bind_7.setBounds(624, 205, 86, 20);
		contentPanel.add(Bind_7);
		
		Bind_8 = new JTextField();
		Bind_8.setColumns(10);
		Bind_8.setBounds(624, 230, 86, 20);
		contentPanel.add(Bind_8);
		
		Value_0 = new JTextField();
		Value_0.setColumns(10);
		Value_0.setBounds(187, 8, 86, 20);
		contentPanel.add(Value_0);
		
		Value_1 = new JTextField();
		Value_1.setColumns(10);
		Value_1.setBounds(187, 36, 86, 20);
		contentPanel.add(Value_1);
		
		Value_2 = new JTextField();
		Value_2.setColumns(10);
		Value_2.setBounds(187, 64, 86, 20);
		contentPanel.add(Value_2);
		
		Value_3 = new JTextField();
		Value_3.setColumns(10);
		Value_3.setBounds(187, 93, 86, 20);
		contentPanel.add(Value_3);
		
		Value_4 = new JTextField();
		Value_4.setColumns(10);
		Value_4.setBounds(187, 120, 86, 20);
		contentPanel.add(Value_4);
		
		Value_5 = new JTextField();
		Value_5.setColumns(10);
		Value_5.setBounds(187, 149, 86, 20);
		contentPanel.add(Value_5);
		
		Value_6 = new JTextField();
		Value_6.setColumns(10);
		Value_6.setBounds(187, 177, 86, 20);
		contentPanel.add(Value_6);
		
		Value_7 = new JTextField();
		Value_7.setColumns(10);
		Value_7.setBounds(187, 205, 86, 20);
		contentPanel.add(Value_7);
		
		Value_8 = new JTextField();
		Value_8.setColumns(10);
		Value_8.setBounds(187, 230, 86, 20);
		contentPanel.add(Value_8);
		
		JLabel Module_0 = new JLabel("Module 1");
		Module_0.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		Module_0.setBounds(10, 8, 46, 14);
		contentPanel.add(Module_0);
		
		JLabel label = new JLabel("Module 1");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label.setBounds(10, 36, 46, 14);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("Module 1");
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_1.setBounds(10, 64, 46, 14);
		contentPanel.add(label_1);
		
		JLabel label_3 = new JLabel("Module 1");
		label_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_3.setBounds(10, 93, 46, 14);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("Module 1");
		label_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_4.setBounds(10, 120, 46, 14);
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("Module 1");
		label_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_5.setBounds(10, 149, 46, 14);
		contentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("Module 1");
		label_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_6.setBounds(10, 177, 46, 14);
		contentPanel.add(label_6);
		
		JLabel label_7 = new JLabel("Module 1");
		label_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_7.setBounds(10, 205, 46, 14);
		contentPanel.add(label_7);
		
		JLabel label_2 = new JLabel("Module 1");
		label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_2.setBounds(10, 230, 46, 14);
		contentPanel.add(label_2);
		
		JLabel label_8 = new JLabel("Module 1");
		label_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_8.setBounds(359, 8, 46, 14);
		contentPanel.add(label_8);
		
		JLabel label_9 = new JLabel("Module 1");
		label_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_9.setBounds(359, 36, 46, 14);
		contentPanel.add(label_9);
		
		JLabel label_10 = new JLabel("Module 1");
		label_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_10.setBounds(359, 64, 46, 14);
		contentPanel.add(label_10);
		
		JLabel label_11 = new JLabel("Module 1");
		label_11.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_11.setBounds(359, 93, 46, 14);
		contentPanel.add(label_11);
		
		JLabel label_12 = new JLabel("Module 1");
		label_12.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_12.setBounds(359, 120, 46, 14);
		contentPanel.add(label_12);
		
		JLabel label_13 = new JLabel("Module 1");
		label_13.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_13.setBounds(359, 149, 46, 14);
		contentPanel.add(label_13);
		
		JLabel label_14 = new JLabel("Module 1");
		label_14.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_14.setBounds(359, 177, 46, 14);
		contentPanel.add(label_14);
		
		JLabel label_15 = new JLabel("Module 1");
		label_15.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_15.setBounds(359, 205, 46, 14);
		contentPanel.add(label_15);
		
		JLabel label_16 = new JLabel("Module 1");
		label_16.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		label_16.setBounds(359, 230, 46, 14);
		contentPanel.add(label_16);
		
		Button setBind_0 = new Button("Bind");
		setBind_0.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setBind_0.setBounds(716, 8, 70, 20);
		contentPanel.add(setBind_0);
		
		Button setBind_1 = new Button("Bind");
		setBind_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setBind_1.setBounds(716, 36, 70, 20);
		contentPanel.add(setBind_1);
		
		Button setBind_2 = new Button("Bind");
		setBind_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setBind_2.setBounds(716, 64, 70, 20);
		contentPanel.add(setBind_2);
		
		Button setBind_3 = new Button("Bind");
		setBind_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setBind_3.setBounds(716, 93, 70, 20);
		contentPanel.add(setBind_3);
		
		Button setBind_4 = new Button("Bind");
		setBind_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setBind_4.setBounds(716, 120, 70, 20);
		contentPanel.add(setBind_4);
		
		Button setBind_5 = new Button("Bind");
		setBind_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setBind_5.setBounds(716, 149, 70, 20);
		contentPanel.add(setBind_5);
		
		Button setBind_7 = new Button("Bind");
		setBind_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setBind_7.setBounds(716, 177, 70, 20);
		contentPanel.add(setBind_7);
		
		Button setBind_9 = new Button("Bind");
		setBind_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setBind_9.setBounds(716, 205, 70, 20);
		contentPanel.add(setBind_9);
		
		Button button_8 = new Button("Bind");
		button_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		button_8.setBounds(716, 230, 70, 20);
		contentPanel.add(button_8);
		
		Button Set_0 = new Button("Set");
		Set_0.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Set_0.setBounds(283, 8, 70, 20);
		contentPanel.add(Set_0);
		
		Button Set_1 = new Button("Set");
		Set_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Set_1.setBounds(283, 36, 70, 20);
		contentPanel.add(Set_1);
		
		Button Set_2 = new Button("Set");
		Set_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Set_2.setBounds(283, 64, 70, 20);
		contentPanel.add(Set_2);
		
		Button Set_3 = new Button("Set");
		Set_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Set_3.setBounds(283, 93, 70, 20);
		contentPanel.add(Set_3);
		
		Button Set_4 = new Button("Set");
		Set_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Set_4.setBounds(283, 120, 70, 20);
		contentPanel.add(Set_4);
		
		Button Set_5 = new Button("Set");
		Set_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Set_5.setBounds(283, 149, 70, 20);
		contentPanel.add(Set_5);
		
		Button Set_6 = new Button("Set");
		Set_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Set_6.setBounds(283, 177, 70, 20);
		contentPanel.add(Set_6);
		
		Button Set_7 = new Button("Set");
		Set_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Set_7.setBounds(283, 205, 70, 20);
		contentPanel.add(Set_7);
		
		Button Set_8 = new Button("Set");
		Set_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Set_8.setBounds(283, 230, 70, 20);
		contentPanel.add(Set_8);
		}
			
	}
}
