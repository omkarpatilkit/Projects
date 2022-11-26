package studentDatabaseManagement;

import java.util.Scanner;

public class CreateStudent {
  static Scanner sc = new Scanner(System.in);

  public static Student createStu() {
    boolean a = true;
    String sName = null;
    Student stu;

    while (a) {
      System.out.println("Enter name: ");
      sName = sc.nextLine();
      if (!sName.isEmpty()) a = false;
    } // end of while

    System.out.println("Enter Last Name: ");
    String sLastName = sc.nextLine();

    System.out.println("Enter age: ");
    int sAge = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter City: ");
    String sCity = sc.nextLine();

    if (sCity.isEmpty() && sAge == 0 && sLastName.isEmpty()) stu =
      new Student(sName); else if (
      sCity.isEmpty() && sAge != 0 && sLastName.isEmpty()
    ) stu = new Student(sName, sAge); else if (
      (!sCity.isEmpty()) && sAge != 0 && sLastName.isEmpty()
    ) stu = new Student(sName, sAge, sCity); else stu =
      new Student(sName, sLastName, sAge, sCity);

    return stu;
  }
}
