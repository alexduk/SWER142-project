package edu.bu.domain;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Admin extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Username :");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 27, 104, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Password :");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 64, 104, 31);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(114, 27, 124, 26);
		contentPane.add(textField);
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(114, 64, 124, 26);
		contentPane.add(textField_1);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				        dispose();
						new ChooseAdd().setVisible(true);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		button.setBounds(20, 107, 218, 38);
		contentPane.add(button);
	}
}
