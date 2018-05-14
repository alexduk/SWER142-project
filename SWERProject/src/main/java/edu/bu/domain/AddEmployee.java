package edu.bu.domain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AddEmployee extends JFrame {

	public static ArrayList<Employee> employees = new ArrayList<Employee>();
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
	public AddEmployee() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\josep\\swer-project\\SWERProject\\employee.png"));
		setTitle("Add Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 125, 330, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("Name :");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblName.setBounds(10, 11, 120, 31);
		contentPane.add(lblName);

		JLabel lblAge = new JLabel("Age :");
		lblAge.setForeground(new Color(255, 255, 255));
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblAge.setBounds(10, 44, 120, 31);
		contentPane.add(lblAge);

		JLabel lblStreetName = new JLabel("Street Name :");
		lblStreetName.setForeground(new Color(255, 255, 255));
		lblStreetName.setHorizontalAlignment(SwingConstants.LEFT);
		lblStreetName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblStreetName.setBounds(10, 77, 120, 31);
		contentPane.add(lblStreetName);

		JLabel lblHouseNumber = new JLabel("House Number :");
		lblHouseNumber.setForeground(new Color(255, 255, 255));
		lblHouseNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblHouseNumber.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblHouseNumber.setBounds(10, 110, 120, 31);
		contentPane.add(lblHouseNumber);

		JLabel lblCity = new JLabel("City :");
		lblCity.setForeground(new Color(255, 255, 255));
		lblCity.setHorizontalAlignment(SwingConstants.LEFT);
		lblCity.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblCity.setBounds(10, 143, 120, 31);
		contentPane.add(lblCity);

		JLabel lblSalary = new JLabel("Salary :");
		lblSalary.setForeground(new Color(255, 255, 255));
		lblSalary.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalary.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblSalary.setBounds(10, 176, 120, 31);
		contentPane.add(lblSalary);

		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 0, 255));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField.setBounds(157, 11, 120, 31);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setBackground(new Color(0, 0, 255));
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(157, 44, 120, 31);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBackground(new Color(0, 0, 255));
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(157, 77, 120, 31);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setForeground(new Color(255, 255, 255));
		textField_3.setBackground(new Color(0, 0, 255));
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_3.setColumns(10);
		textField_3.setBounds(157, 110, 120, 31);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setBackground(new Color(0, 0, 255));
		textField_4.setForeground(new Color(255, 255, 255));
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_4.setColumns(10);
		textField_4.setBounds(157, 143, 120, 31);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setForeground(new Color(255, 255, 255));
		textField_5.setBackground(new Color(0, 0, 255));
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField_5.setColumns(10);
		textField_5.setBounds(157, 176, 120, 31);
		contentPane.add(textField_5);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean c = ifExist(textField.getText());
				if (c) {
					if (textField.getText().isEmpty() || textField_1.getText().isEmpty()
							|| textField_2.getText().isEmpty() || textField_3.getText().isEmpty()
							|| textField_4.getText().isEmpty() || textField_5.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please fill all the blanks!", "Error", getState());
					} else {
						try {

							employees
									.add(new Employee(textField.getText(), Integer.parseInt(textField_1.getText()),
											(new Address(textField_2.getText(), textField_3.getText(),
													textField_4.getText())),
											Double.parseDouble(textField_5.getText())));
							JOptionPane.showMessageDialog(null, "Done");
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");

						} catch (Exception n) {
							JOptionPane.showMessageDialog(null, "Please enter a correct information!", "Error",
									getState());
						}
					}
				}
			}

			private boolean ifExist(String text) {
				for (Employee l : AddEmployee.employees) {
					if (textField.getText().equals(l.name)) {
						JOptionPane.showMessageDialog(null,
								"Sorry, this name is already exist. Try again!!", "Error", getState());
						return false;
					}
				}
				for (Student l : AddStudent.students) {
					if (textField.getText().equals(l.name)) {
						JOptionPane.showMessageDialog(null,
								"Sorry, this name is already exist. Try again!!", "Error", getState());
						return false;
					}
				}
				return true;
			}
		});

		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(10, 218, 130, 32);
		contentPane.add(btnNewButton);

		btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 255));
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ChooseAdd().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnBack.setBounds(147, 218, 130, 32);
		contentPane.add(btnBack);
	}

}
