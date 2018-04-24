package edu.bu.domain;
public class Administrator{
	String username;
	String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Administrator(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
}	

/*
 * 
           
           System.out.println("Enter the person's age: ");
           int age = input.nextInt();  
           input.nextLine();
           System.out.println("Enter the person's street name: ");
           String streetNum = input.nextLine();
           System.out.println("Enter the person's house numebr: ");
           String houseNum = input.nextLine();
           System.out.println("Enter the person's city: ");
           String city = input.nextLine();
           Address address = new Address(streetNum, houseNum, city);
           if(choice == 1) {
               System.out.println("Enter the grade");
               int grade = input.nextInt();  
                  input.nextLine();
               list[count] = new Student(name, age, grade);
               list[count].setAddress(address);
           }
           else {
               System.out.println("Enter the salary");
               int salary = input.nextInt();  
                  input.nextLine();
               list[count] = new Employee(name, age, salary);
               list[count].setAddress(address);
           }           
           */