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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AddAdmin extends JFrame {
	public static ArrayList<Administrator> admins2 = new ArrayList<Administrator>();

	private JPanel contentPane;
	public static JTextField textField;
	public static JPasswordField textField_1;
	private JLabel label;
	private JLabel lblRepassword;
	public static JPasswordField textField_2;
	ObjectMapper m = new ObjectMapper();
	public static Administrator arrayOfAdmins;

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
		setTitle("Add Admin");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\josep\\swer-project\\SWERProject\\customer-service.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 210);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblUsername.setBounds(10, 11, 105, 22);
		contentPane.add(lblUsername);

		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 0, 255));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setBounds(122, 11, 102, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JPasswordField();
		textField_1.setBackground(new Color(0, 0, 255));
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(122, 44, 102, 22);
		contentPane.add(textField_1);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().isEmpty() || textField_1.getText().isEmpty()
						|| textField_2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill all the blanks!", "Error", getState());
				} else if (textField_1.getText().equals(textField_2.getText())) {
					JOptionPane.showMessageDialog(null, "Done");
					try {
						String jsonString = m.writeValueAsString(admins2);
						arrayOfAdmins = m.readValue(jsonString, Administrator.class);
						admins2.add(arrayOfAdmins);

					} catch (Exception e) {
					}
					dispose();
					new ChooseAdd().setVisible(true);

					admins2.add(new Administrator(textField.getText(), textField_1.getText()));

				} else {
					JOptionPane.showMessageDialog(null, "Passowrds don't match!!", "Error", getState());
				}

			}
		});
		btnNewButton.setFont(new Font("Century", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 116, 105, 35);
		contentPane.add(btnNewButton);

		label = new JLabel("Password :");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label.setBounds(10, 44, 105, 22);
		contentPane.add(label);

		lblRepassword = new JLabel("Re-Password :");
		lblRepassword.setForeground(new Color(255, 255, 255));
		lblRepassword.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblRepassword.setBounds(10, 77, 105, 22);
		contentPane.add(lblRepassword);

		textField_2 = new JPasswordField();
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setBackground(new Color(0, 0, 255));
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(122, 77, 102, 22);
		contentPane.add(textField_2);

		JButton button = new JButton("Back");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new ChooseAdd().setVisible(true);
			}
		});
		button.setFont(new Font("Century", Font.PLAIN, 18));
		button.setBounds(119, 116, 105, 35);
		contentPane.add(button);
	}
}
