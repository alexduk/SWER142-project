package edu.bu.domain;
import java.util.ArrayList;

public class Student extends Person {
	double grade;

	public Student(String name, int age, Address address, double grade) {
		super(name, age, address);
		this.grade = grade;
	}
	
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}
