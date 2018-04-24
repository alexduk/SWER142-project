package edu.bu.domain;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseAdd extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseAdd frame = new ChooseAdd();
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
	public ChooseAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AddEmployee().setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 11, 414, 40);
		contentPane.add(btnNewButton);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AddStudent().setVisible(true);
			}
		});
		btnAddStudent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddStudent.setBounds(10, 61, 414, 40);
		contentPane.add(btnAddStudent);
		
		JButton btnAddAdmin = new JButton("Add Admin");
		btnAddAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AddAdmin().setVisible(true);
				
			}
		});
		btnAddAdmin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddAdmin.setBounds(10, 111, 414, 40);
		contentPane.add(btnAddAdmin);
		
		JButton btnSearchForEmployees = new JButton("Search For Employees and Students");
		btnSearchForEmployees.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSearchForEmployees.setBounds(10, 161, 414, 40);
		contentPane.add(btnSearchForEmployees);
		
		JButton btnReportGra = new JButton("Report Salaries and Grades");
		btnReportGra.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReportGra.setBounds(10, 211, 414, 40);
		contentPane.add(btnReportGra);
	}
}
