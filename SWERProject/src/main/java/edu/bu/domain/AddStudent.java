package edu.bu.domain;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
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
	public AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblName.setBounds(10, 11, 120, 31);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblAge.setBounds(10, 44, 120, 31);
		contentPane.add(lblAge);
		
		JLabel lblStreetName = new JLabel("Street Name :");
		lblStreetName.setHorizontalAlignment(SwingConstants.LEFT);
		lblStreetName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblStreetName.setBounds(10, 77, 120, 31);
		contentPane.add(lblStreetName);
		
		JLabel lblHouseNumber = new JLabel("House Number :");
		lblHouseNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblHouseNumber.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblHouseNumber.setBounds(10, 110, 120, 31);
		contentPane.add(lblHouseNumber);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setHorizontalAlignment(SwingConstants.LEFT);
		lblCity.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblCity.setBounds(10, 143, 120, 31);
		contentPane.add(lblCity);
		
		JLabel lblSalary = new JLabel("Grade :");
		lblSalary.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalary.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblSalary.setBounds(10, 176, 120, 31);
		contentPane.add(lblSalary);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField.setBounds(157, 11, 120, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(157, 44, 120, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(157, 77, 120, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_3.setColumns(10);
		textField_3.setBounds(157, 110, 120, 31);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_4.setColumns(10);
		textField_4.setBounds(157, 143, 120, 31);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_5.setColumns(10);
		textField_5.setBounds(157, 176, 120, 31);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(10, 218, 130, 32);
		contentPane.add(btnNewButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ChooseAdd().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnBack.setBounds(150, 218, 130, 32);
		contentPane.add(btnBack);
	}

}
