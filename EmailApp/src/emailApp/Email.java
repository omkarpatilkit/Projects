package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
	
	private String name;
	private String lastName;
	private String department;
	private String password;
	private String email;
	
	
	//constructor name and Last name
	public Email(String name , String lastName) {
		this.name = name;
		this.lastName = lastName;
//		this.department = getDepartment();
		this.password = passwordGen(8);
		this.email = emailGen();
		System.out.println("Your email is: " + email);
		System.out.println("Your password is: " + password);
	}
	
	// ask for department
	private String getDepartment () {
		System.out.println("Please enter department");
		System.out.println("1.Accounting\n2.Sales\n3.Development\nany other value for none");
		
		Scanner sc = new Scanner(System.in);
		int choice  = sc.nextInt();
		String dept;
		
		switch (choice) {
		case 1: 
			dept = "Accounting";
			break;
		
		case 2: 
			dept = "Sales";
			break;
			
		case 3:
			dept = "Department";
			break;
			
		default:
			dept = "None";
			break;			
		}
		sc.close();
		return dept;
	}
	
	//generate random password
	private String passwordGen(int Len) {
		String set= "ABCDEFGHIJKLMNO!@#PQRSTUVWXYZ!@#1234567890!@#abcdefghijklmnopqrstuvqxyz";
		char[] pass = new char[Len];
		Random randomInt = new Random();
		for(int i = 0 ; i<Len ; i++) {
			int rInt = randomInt.nextInt(set.length());
		    pass[i] = set.charAt(rInt);
		}
		return (new String(pass));
		
	}
	
	private String emailGen() {
		String emailGen = this.name.toLowerCase()+this.lastName.toLowerCase()+"@"+"comp.com" ;
		return emailGen;
			}
	
	
	//change password
	

}
