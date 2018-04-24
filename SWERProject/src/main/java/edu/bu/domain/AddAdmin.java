package edu.bu.domain;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnBack;
	private JLabel label;
	private JLabel lblRepassword;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAdmin frame = new AddAdmin();
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
	public AddAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblUsername.setBounds(10, 11, 105, 22);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setBounds(122, 11, 102, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(122, 44, 102, 22);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton.setBounds(10, 116, 102, 35);
		contentPane.add(btnNewButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ChooseAdd().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Dialog", Font.BOLD, 20));
		btnBack.setBounds(122, 116, 102, 35);
		contentPane.add(btnBack);
		
		label = new JLabel("Password :");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label.setBounds(10, 44, 105, 22);
		contentPane.add(label);
		
		lblRepassword = new JLabel("Re-Password :");
		lblRepassword.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblRepassword.setBounds(10, 77, 105, 22);
		contentPane.add(lblRepassword);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(122, 77, 102, 22);
		contentPane.add(textField_2);
	}

}
