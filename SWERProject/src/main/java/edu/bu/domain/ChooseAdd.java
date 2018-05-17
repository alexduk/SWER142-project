package edu.bu.domain;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.fasterxml.jackson.core.JsonProcessingException;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("layers.png"));
		setTitle("Choose");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 125, 380, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AddEmployee().setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(10, 56, 337, 40);
		contentPane.add(btnNewButton);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.setForeground(Color.BLUE);
		btnAddStudent.setBackground(Color.WHITE);
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AddStudent().setVisible(true);
			}
		});
		btnAddStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAddStudent.setBounds(10, 107, 337, 40);
		contentPane.add(btnAddStudent);
		
		JButton btnAddAdmin = new JButton("Add Admin");
		btnAddAdmin.setForeground(Color.BLUE);
		btnAddAdmin.setBackground(Color.WHITE);
		btnAddAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AddAdmin().setVisible(true);
				
			}
		});
		btnAddAdmin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAddAdmin.setBounds(10, 158, 337, 40);
		contentPane.add(btnAddAdmin);
		
		JButton btnSearchForEmployees = new JButton("Search For Employees and Students");
		btnSearchForEmployees.setForeground(Color.BLUE);
		btnSearchForEmployees.setBackground(Color.WHITE);
		btnSearchForEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Search().setVisible(true);
			}
		});
		btnSearchForEmployees.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSearchForEmployees.setBounds(10, 209, 337, 40);
		contentPane.add(btnSearchForEmployees);
		
		JButton btnReportGra = new JButton("Report Salaries and Grades");
		btnReportGra.setForeground(Color.BLUE);
		btnReportGra.setBackground(Color.WHITE);
		btnReportGra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Report().setVisible(true);
			}
		});
		btnReportGra.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReportGra.setBounds(10, 260, 337, 40);
		contentPane.add(btnReportGra);
		try{
		String s = Admin.textField.getText();
		JLabel lblWelcomeAdmin = new JLabel("Welcome " + s);
		lblWelcomeAdmin.setForeground(new Color(255, 255, 255));
		lblWelcomeAdmin.setBackground(new Color(255, 255, 255));
		lblWelcomeAdmin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblWelcomeAdmin.setBounds(10, 11, 205, 34);
		contentPane.add(lblWelcomeAdmin);
		}
		catch (Exception c){
			
		}
		
		
		
		JButton btnNewButton_1 = new JButton("Log out");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				try {
					new Admin().setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(220, 11, 127, 34);
		contentPane.add(btnNewButton_1);
		
	}
}
