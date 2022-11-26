package studentDatabaseMangement;

import java.io.IOException;
import java.util.Scanner;

public class StudentManegment {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		
		while (a) {
			System.out.println("Press 1 to view students: ");
			System.out.println("Press 2 to add a student: ");
			System.out.println("press 3 to update student details: ");
			System.out.println("press 4 to delete student: ");
			System.out.println("press 5 to Export PDF");
			System.out.println("press any other key to exit from system.");
			
			int choice = 1;
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1 :
				StuDB.viewStudents();
				break;
				
			case 2:
				StuDB.addStudent();
				break;
				
			case 3:
				StuDB.updateStudent();
				break;
				
			case 4: 
				StuDB.deleteStudent();
				break;
				
			case 5: 
				try {
					StuDB.createPDF();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			default: 
				a = false;
				break;
			
			}
		}
		sc.close();
		
		
	}

}
