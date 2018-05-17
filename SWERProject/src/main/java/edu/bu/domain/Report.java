package edu.bu.domain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Report extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JButton btnPrint;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setTitle("Report");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\josep\\swer-project\\SWERProject\\bars-chart.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 125, 430, 322);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setForeground(new Color(0, 0, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblChooseWhichOne = new JLabel("Choose which one you want to report.");
		lblChooseWhichOne.setForeground(new Color(255, 255, 255));
		lblChooseWhichOne.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblChooseWhichOne.setBounds(39, 29, 245, 14);
		contentPane.add(lblChooseWhichOne);

		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 255));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBounds(185, 97, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		final JRadioButton rdbtnEmployees = new JRadioButton("Employees");
		rdbtnEmployees.setBackground(new Color(0, 0, 255));
		rdbtnEmployees.setForeground(new Color(255, 255, 255));
		rdbtnEmployees.setSelected(true);
		rdbtnEmployees.setBounds(39, 61, 109, 23);
		contentPane.add(rdbtnEmployees);

		JRadioButton rdbtnStudents = new JRadioButton("Students");
		rdbtnStudents.setForeground(new Color(255, 255, 255));
		rdbtnStudents.setBackground(new Color(0, 0, 255));
		rdbtnStudents.setBounds(162, 61, 109, 23);
		contentPane.add(rdbtnStudents);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnStudents);
		group.add(rdbtnEmployees);

		JLabel lblEnterASalary = new JLabel("Enter a Salary/Grade:");
		lblEnterASalary.setForeground(new Color(255, 255, 255));
		lblEnterASalary.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEnterASalary.setBounds(39, 99, 120, 14);
		contentPane.add(lblEnterASalary);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 128, 341, 109);
		contentPane.add(scrollPane);

		final JTextPane frmtdtxtfldSdf = new JTextPane();
		frmtdtxtfldSdf.setForeground(new Color(255, 255, 255));
		frmtdtxtfldSdf.setBackground(new Color(0, 0, 255));
		frmtdtxtfldSdf.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(frmtdtxtfldSdf);
		frmtdtxtfldSdf.setEditable(false);
		frmtdtxtfldSdf.setText("");

		JButton btnReport = new JButton("Report");
		btnReport.setForeground(Color.BLUE);
		btnReport.setBackground(Color.WHITE);
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnEmployees.isSelected()) {
					try {
						int a = Integer.parseInt(textField.getText());
						String t = "";
						String s = "The Employees are:\tThe Salaries are:\n";
						for (int i = 0; i < AddEmployee.employees.size(); i++) {
							if ((AddEmployee.employees.get(i).salary) > a) {
								t += AddEmployee.employees.get(i).name + "\t\t" + AddEmployee.employees.get(i).salary
										+ "\n";
							}
						}
						if (t.length() < 2) {
							btnPrint.setEnabled(true);
							frmtdtxtfldSdf.setText("No Employees were found with a salary higher than " + a  +".");
						} else {
							btnPrint.setEnabled(true);
							frmtdtxtfldSdf.setText(s + t);
						}
					} catch (Exception c) {
						JOptionPane.showMessageDialog(null, "Please enter a Salary", "Error", getState());
					}
				} else {
					try {
						int a = Integer.parseInt(textField.getText());
						String t = "";
						String s = "The Students are:\tThe Grades are:\n";
						for (int i = 0; i < AddStudent.students.size(); i++) {
							if ((AddStudent.students.get(i).grade) > a) {
								t += AddStudent.students.get(i).name + "\t\t" + AddStudent.students.get(i).grade + "\n";
							}
						}
						if (t.length() < 2) {
							btnPrint.setEnabled(true);
							frmtdtxtfldSdf.setText("No Students were found with a grade higher than " + a + ".");
						} else {
							btnPrint.setEnabled(true);
							frmtdtxtfldSdf.setText(s + t);
						}
					} catch (Exception c) {
						JOptionPane.showMessageDialog(null, "Please enter a Grade", "Error", getState());
					}
				}
			}
		});
		btnReport.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReport.setBounds(281, 95, 99, 23);
		contentPane.add(btnReport);

		JButton btnBack = new JButton("Back");
		btnBack.setBackground(Color.WHITE);
		btnBack.setForeground(Color.BLUE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ChooseAdd().setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBack.setBounds(281, 247, 99, 23);
		contentPane.add(btnBack);

		JButton btnHelp = new JButton("Help");
		btnHelp.setBackground(Color.WHITE);
		btnHelp.setForeground(Color.BLUE);
		btnHelp.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"This report shows which Employees/Students with \nhigher Salaries/Grades than the entered number, \nthen you can print the report.");

			}
		});
		btnHelp.setBounds(39, 248, 99, 23);
		contentPane.add(btnHelp);

		btnPrint = new JButton("Save & Print");
		btnPrint.setForeground(Color.BLUE);
		btnPrint.setBackground(Color.WHITE);
		btnPrint.setEnabled(false);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frmtdtxtfldSdf.print();
				} catch (PrinterException e) {
					JOptionPane.showMessageDialog(null, "Couldn't print, try again later.", "Error", getState());
				}

			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnPrint.setBounds(143, 248, 133, 23);
		contentPane.add(btnPrint);
	}
}
