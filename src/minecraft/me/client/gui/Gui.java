package me.client.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the dialog.
	 */
	public Gui() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnToggle = new JButton("Toggle");
			btnToggle.setBounds(359, 11, 65, 17);
			contentPanel.add(btnToggle);
		}
		
		JButton button = new JButton("Toggle");
		button.setBounds(359, 39, 65, 17);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("Toggle");
		button_1.setBounds(359, 67, 65, 17);
		contentPanel.add(button_1);
		
		JButton button_2 = new JButton("Toggle");
		button_2.setBounds(359, 95, 65, 17);
		contentPanel.add(button_2);
		
		JButton button_3 = new JButton("Toggle");
		button_3.setBounds(359, 123, 65, 17);
		contentPanel.add(button_3);
		
		JButton button_4 = new JButton("Toggle");
		button_4.setBounds(359, 151, 65, 17);
		contentPanel.add(button_4);
		
		JButton button_5 = new JButton("Toggle");
		button_5.setBounds(359, 179, 65, 17);
		contentPanel.add(button_5);
		
		JButton button_6 = new JButton("Toggle");
		button_6.setBounds(359, 207, 65, 17);
		contentPanel.add(button_6);
		
		JButton button_7 = new JButton("Toggle");
		button_7.setBounds(359, 235, 65, 17);
		contentPanel.add(button_7);
		
		JLabel lblReach = new JLabel("Module 1");
		lblReach.setBounds(10, 11, 46, 14);
		contentPanel.add(lblReach);
		
		JLabel lblModule = new JLabel("Module 2");
		lblModule.setBounds(10, 40, 46, 14);
		contentPanel.add(lblModule);
		
		JLabel lblModule_1 = new JLabel("Module 3");
		lblModule_1.setBounds(10, 68, 46, 14);
		contentPanel.add(lblModule_1);
		
		JLabel lblModule_2 = new JLabel("Module 4");
		lblModule_2.setBounds(10, 96, 46, 14);
		contentPanel.add(lblModule_2);
		
		JLabel lblModule_3 = new JLabel("Module 5");
		lblModule_3.setBounds(10, 124, 46, 14);
		contentPanel.add(lblModule_3);
		
		JLabel lblModule_4 = new JLabel("Module 6");
		lblModule_4.setBounds(10, 152, 46, 14);
		contentPanel.add(lblModule_4);
		
		JLabel lblModule_5 = new JLabel("Module 7");
		lblModule_5.setBounds(10, 180, 46, 14);
		contentPanel.add(lblModule_5);
		
		JLabel lblModule_6 = new JLabel("Module 8");
		lblModule_6.setBounds(10, 208, 46, 14);
		contentPanel.add(lblModule_6);
		
		JLabel lblModule_7 = new JLabel("Module 9");
		lblModule_7.setBounds(10, 236, 46, 14);
		contentPanel.add(lblModule_7);
		
		textField = new JTextField();
		textField.setBounds(263, 9, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(263, 37, 86, 20);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(263, 65, 86, 20);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(263, 93, 86, 20);
		contentPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(263, 120, 86, 20);
		contentPanel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(263, 149, 86, 20);
		contentPanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(263, 177, 86, 20);
		contentPanel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(263, 205, 86, 20);
		contentPanel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(263, 230, 86, 20);
		contentPanel.add(textField_8);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setBounds(207, 12, 46, 14);
		contentPanel.add(lblValue);
		
		JLabel label = new JLabel("Value");
		label.setBounds(207, 40, 46, 14);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("Value");
		label_1.setBounds(207, 68, 46, 14);
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("Value");
		label_2.setBounds(207, 96, 46, 14);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("Value");
		label_3.setBounds(207, 124, 46, 14);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("Value");
		label_4.setBounds(207, 152, 46, 14);
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("Value");
		label_5.setBounds(207, 180, 46, 14);
		contentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("Value");
		label_6.setBounds(207, 208, 46, 14);
		contentPanel.add(label_6);
		
		JLabel label_7 = new JLabel("Value");
		label_7.setBounds(207, 233, 46, 14);
		contentPanel.add(label_7);
	}
}
