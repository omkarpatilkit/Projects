package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
	
	private String name;
	private String lastName;
	private String department;
	private String password;
	private String email;
	DbOperations db = new DbOperations();
	
	//constructor name and Last name
	public Email(String name , String lastName, String dept) {
		this.name = name;
		this.lastName = lastName;
		this.department = dept;
		this.password = passwordGen(8);
		this.email = emailGen();
		db.insertIntoDB(this.name , this.lastName , this.email ,this.password  , this.department);
		
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
		String emailGen = this.name.toLowerCase()+this.lastName.toLowerCase()+this.department.toLowerCase()+"@"+"comp.com" ;
		return emailGen;
			}
	
	
	//change password
	

}
