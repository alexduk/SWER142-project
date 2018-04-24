package edu.bu.domain;
public class Employee extends Person {
	
	int salary;

	public Employee(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
