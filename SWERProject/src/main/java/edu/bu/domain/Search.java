package edu.bu.domain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnSave;
	public static int indexM;
	public static int indexS;
	public static int indexB1 = -1;
	public static int indexB2 = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("\\SWERProject\\search.png"));
		setTitle("Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSearchForEmployees = new JLabel("Search for Employees or Students.");
		lblSearchForEmployees.setForeground(new Color(255, 255, 255));
		lblSearchForEmployees.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSearchForEmployees.setBounds(27, 17, 239, 20);
		contentPane.add(lblSearchForEmployees);

		final JRadioButton rdbtnEmployees = new JRadioButton("Employees");
		rdbtnEmployees.setBackground(new Color(0, 0, 255));
		rdbtnEmployees.setForeground(new Color(255, 255, 255));
		rdbtnEmployees.setSelected(true);
		rdbtnEmployees.setBounds(27, 47, 88, 23);
		contentPane.add(rdbtnEmployees);

		final JRadioButton rdbtnStudents = new JRadioButton("Students");
		rdbtnStudents.setForeground(new Color(255, 255, 255));
		rdbtnStudents.setBackground(new Color(0, 0, 255));
		rdbtnStudents.setBounds(114, 47, 77, 23);
		contentPane.add(rdbtnStudents);

		final JRadioButton rdbtnBoth = new JRadioButton("Both");
		rdbtnBoth.setForeground(new Color(255, 255, 255));
		rdbtnBoth.setBackground(new Color(0, 0, 255));
		rdbtnBoth.setBounds(193, 47, 53, 23);
		contentPane.add(rdbtnBoth);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnBoth);
		group.add(rdbtnStudents);
		group.add(rdbtnEmployees);

		JLabel lblEnterAName = new JLabel("Enter a name :");
		lblEnterAName.setForeground(new Color(255, 255, 255));
		lblEnterAName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEnterAName.setBounds(27, 77, 99, 14);
		contentPane.add(lblEnterAName);

		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 255));
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField.setBounds(124, 77, 122, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblAge = new JLabel("Age :");
		lblAge.setForeground(new Color(255, 255, 255));
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAge.setBounds(27, 121, 99, 14);
		contentPane.add(lblAge);

		JLabel lblStreet = new JLabel("Street Name :");
		lblStreet.setForeground(new Color(255, 255, 255));
		lblStreet.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblStreet.setBounds(27, 146, 99, 14);
		contentPane.add(lblStreet);

		JLabel lblHouseNumber = new JLabel("House Number :");
		lblHouseNumber.setForeground(new Color(255, 255, 255));
		lblHouseNumber.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblHouseNumber.setBounds(27, 171, 99, 14);
		contentPane.add(lblHouseNumber);

		JLabel lblCity = new JLabel("City :");
		lblCity.setForeground(new Color(255, 255, 255));
		lblCity.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCity.setBounds(27, 195, 99, 14);
		contentPane.add(lblCity);

		JLabel lblSalarygrade = new JLabel("Salary/Grade :");
		lblSalarygrade.setForeground(new Color(255, 255, 255));
		lblSalarygrade.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSalarygrade.setBounds(27, 220, 99, 14);
		contentPane.add(lblSalarygrade);

		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setBackground(new Color(0, 0, 255));
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(124, 118, 122, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBackground(new Color(0, 0, 255));
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(124, 143, 122, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setForeground(new Color(255, 255, 255));
		textField_3.setBackground(new Color(0, 0, 255));
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(124, 168, 122, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setBackground(new Color(0, 0, 255));
		textField_4.setForeground(new Color(255, 255, 255));
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(124, 192, 122, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setForeground(new Color(255, 255, 255));
		textField_5.setBackground(new Color(0, 0, 255));
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(124, 217, 122, 20);
		contentPane.add(textField_5);

		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setBackground(new Color(0, 0, 255));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (rdbtnEmployees.isSelected()) {
					boolean z = isExistEm(textField.getText());
					if (textField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please enter an Employee.");
					} else if (z) {
						for (int i = 0; i < AddEmployee.employees.size(); i++) {
							if (textField.getText().equals(AddEmployee.employees.get(i).name)) {
								textField_1.setText(String.valueOf(AddEmployee.employees.get(i).age));
								textField_2.setText(AddEmployee.employees.get(i).address.streetName);
								textField_3.setText(AddEmployee.employees.get(i).address.houseNumber);
								textField_4.setText(AddEmployee.employees.get(i).address.city);
								textField_5.setText(String.valueOf(AddEmployee.employees.get(i).salary));
								textField_1.setEditable(true);
								textField_2.setEditable(true);
								textField_3.setEditable(true);
								textField_4.setEditable(true);
								textField_5.setEditable(true);
								btnSave.setEnabled(true);
								indexM = i;
							}
						}
					} else {
						textField_1.setEditable(false);
						textField_2.setEditable(false);
						textField_3.setEditable(false);
						textField_4.setEditable(false);
						textField_5.setEditable(false);
						btnSave.setEnabled(false);
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						JOptionPane.showMessageDialog(null,
								"No Employees were found with a name of \"" + textField.getText() + "\"");
					}
				}

				if (rdbtnStudents.isSelected()) {
					boolean z = isExistSt(textField.getText());
					if (textField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please enter a Student.");
					} else if (z) {
						for (int i = 0; i < AddStudent.students.size(); i++) {
							if (textField.getText().equals(AddStudent.students.get(i).name)) {
								textField_1.setText(String.valueOf(AddStudent.students.get(i).age));
								textField_2.setText(AddStudent.students.get(i).address.streetName);
								textField_3.setText(AddStudent.students.get(i).address.houseNumber);
								textField_4.setText(AddStudent.students.get(i).address.city);
								textField_5.setText(String.valueOf(AddStudent.students.get(i).grade));
								textField_1.setEditable(true);
								textField_2.setEditable(true);
								textField_3.setEditable(true);
								textField_4.setEditable(true);
								textField_5.setEditable(true);
								btnSave.setEnabled(true);
								indexS = i;
							}
						}
					} else {
						textField_1.setEditable(false);
						textField_2.setEditable(false);
						textField_3.setEditable(false);
						textField_4.setEditable(false);
						textField_5.setEditable(false);
						btnSave.setEnabled(false);
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						JOptionPane.showMessageDialog(null,
								"No Students were found with a name of \"" + textField.getText() + "\"");
					}
				}
				if (rdbtnBoth.isSelected()) {
					boolean z = isExistBo(textField.getText());
					if (textField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please enter a Person.");
					} else if (z) {
						for (int i = 0; i < AddEmployee.employees.size(); i++) {
							if (textField.getText().equals(AddEmployee.employees.get(i).name)) {
								textField_1.setText(String.valueOf(AddEmployee.employees.get(i).age));
								textField_2.setText(AddEmployee.employees.get(i).address.streetName);
								textField_3.setText(AddEmployee.employees.get(i).address.houseNumber);
								textField_4.setText(AddEmployee.employees.get(i).address.city);
								textField_5.setText(String.valueOf(AddEmployee.employees.get(i).salary));
								textField_1.setEditable(true);
								textField_2.setEditable(true);
								textField_3.setEditable(true);
								textField_4.setEditable(true);
								textField_5.setEditable(true);
								btnSave.setEnabled(true);
								indexB1 = i;
							}
						}

						for (int i = 0; i < AddStudent.students.size(); i++) {
							if (textField.getText().equals(AddStudent.students.get(i).name)) {
								textField_1.setText(String.valueOf(AddStudent.students.get(i).age));
								textField_2.setText(AddStudent.students.get(i).address.streetName);
								textField_3.setText(AddStudent.students.get(i).address.houseNumber);
								textField_4.setText(AddStudent.students.get(i).address.city);
								textField_5.setText(String.valueOf(AddStudent.students.get(i).grade));
								textField_1.setEditable(true);
								textField_2.setEditable(true);
								textField_3.setEditable(true);
								textField_4.setEditable(true);
								textField_5.setEditable(true);
								btnSave.setEnabled(true);
								indexB2 = i;
							}
						}

					} else {
						textField_1.setEditable(false);
						textField_2.setEditable(false);
						textField_3.setEditable(false);
						textField_4.setEditable(false);
						textField_5.setEditable(false);
						btnSave.setEnabled(false);
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						JOptionPane.showMessageDialog(null,
								"No people were found with a name of \"" + textField.getText() + "\"");
					}
				}
			}

			private boolean isExistBo(String text) {
				for (Employee e : AddEmployee.employees) {
					if (textField.getText().equals(e.name)) {
						return true;
					}
				}
				for (Student s : AddStudent.students) {
					if (textField.getText().equals(s.name)) {
						return true;
					}
				}
				return false;
			}

			private boolean isExistSt(String text) {
				for (Student s : AddStudent.students) {
					if (textField.getText().equals(s.name)) {
						return true;
					}
				}
				return false;
			}

			private boolean isExistEm(String text) {
				for (Employee e : AddEmployee.employees) {
					if (textField.getText().equals(e.name)) {
						return true;
					}
				}
				return false;
			}
		});
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSearch.setBounds(256, 76, 89, 20);
		contentPane.add(btnSearch);

		JLabel lblNewLabel = new JLabel("----------------------------------------------------");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(27, 102, 219, 8);
		contentPane.add(lblNewLabel);

		btnSave = new JButton("Save");
		btnSave.setBackground(new Color(0, 0, 255));
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (rdbtnEmployees.isSelected()) {
						AddEmployee.employees.set(indexM,
								(new Employee(textField.getText(),
										Integer.parseInt(textField_1.getText()), (new Address(textField_2.getText(),
												textField_3.getText(), textField_4.getText())),
										Double.parseDouble(textField_5.getText()))));
						JOptionPane.showMessageDialog(null, "Successfully saved");
					}
					if (rdbtnStudents.isSelected()) {
						AddStudent.students.set(indexS,
								(new Student(textField.getText(),
										Integer.parseInt(textField_1.getText()), (new Address(textField_2.getText(),
												textField_3.getText(), textField_4.getText())),
										Double.parseDouble(textField_5.getText()))));
						JOptionPane.showMessageDialog(null, "Successfully saved");
					}
					if (rdbtnBoth.isSelected()) {

						if (indexB1 > -1) {
							AddEmployee.employees.set(indexB1,
									(new Employee(textField.getText(), Integer.parseInt(textField_1.getText()),
											(new Address(textField_2.getText(), textField_3.getText(),
													textField_4.getText())),
											Double.parseDouble(textField_5.getText()))));
							JOptionPane.showMessageDialog(null, "Successfully saved");
							indexB1 = -1;
						} else if (indexB2 > -1) {
							AddStudent.students.set(indexB2,
									(new Student(textField.getText(), Integer.parseInt(textField_1.getText()),
											(new Address(textField_2.getText(), textField_3.getText(),
													textField_4.getText())),
											Double.parseDouble(textField_5.getText()))));
							JOptionPane.showMessageDialog(null, "Successfully saved");
							indexB2 = -1;
						}
					}

				} catch (Exception n) {
					JOptionPane.showMessageDialog(null, "Please enter a correct information!", "Error", getState());
				}
			}
		});
		btnSave.setEnabled(false);
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSave.setBounds(256, 146, 89, 44);
		contentPane.add(btnSave);

		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setBackground(new Color(0, 0, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ChooseAdd().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBack.setBounds(256, 195, 89, 44);
		contentPane.add(btnBack);
	}
}
