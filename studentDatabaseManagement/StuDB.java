package studentDatabaseManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StuDB {
  static Connection cn = ConnectToDB.connectJDBC();
  static Scanner sc = new Scanner(System.in);

  public static void viewStudents() {
    String query = "select * from student_db.students";
    try {
      Statement st = cn.createStatement();

      ResultSet rs = st.executeQuery(query);

      while (rs.next()) {
        System.out.print("sID: " + rs.getInt(1) + "  ||  ");
        System.out.print("sName " + rs.getString(2) + "  ||  ");
        System.out.print("sLastName " + rs.getString(3) + "  ||  ");
        System.out.print("sAge " + rs.getInt(4) + "  ||  ");
        System.out.print("sCity " + rs.getString(5) + "  ||  ");
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void addStudent() {
    Student stu = CreateStudent.createStu();
    String query =
      "insert into student_db.students (sname,slast_name, sage, scity) values (?,?,?,?)";

    try {
      PreparedStatement pst = cn.prepareStatement(query);
      pst.setString(1, stu.getsName());
      pst.setString(2, stu.getsLastName());
      pst.setInt(3, stu.getAge());
      pst.setString(4, stu.getCity());

      pst.executeUpdate();
    } catch (SQLException e) {
      System.out.println(e);
      System.out.println("Failed to add student.");
    }
  }

  public static void deleteStudent() {
    int stuID;
    stuID = sc.nextInt();
    sc.nextLine();

    try {
      PreparedStatement pst = cn.prepareStatement(
        "delete from student_db.students where sid = ?"
      );
      pst.setInt(1, stuID);
      pst.executeUpdate();
      System.out.println("Student deleted.");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void updateStudent() {
    System.out.print("Please enter valid Student id: ");
    int sId = sc.nextInt();
    sc.nextLine();

    System.out.println("What you want to update");
    System.out.print("1. Last Name\n2. Age\n3. City");
    int uCh;
    uCh = sc.nextInt();
    sc.nextLine();
    switch (uCh) {
      case 1:
        System.out.print("Please enter new Last Name: ");
        String LastName = sc.nextLine();
        try {
          PreparedStatement pst = cn.prepareStatement(
            "update student_db.students set slast_name = ? where sid = ?"
          );
          pst.setString(1, LastName);
          pst.setInt(2, sId);
          pst.executeUpdate();
        } catch (SQLException e) {
          e.printStackTrace();
        }
        break;
      case 2:
        System.out.print("Please enter new age: ");
        int age = sc.nextInt();
        sc.nextLine();
        try {
          PreparedStatement pst = cn.prepareStatement(
            "update student_db.students set sage = ? where sid = ?"
          );
          pst.setInt(1, age);
          pst.setInt(2, sId);
          pst.executeUpdate();
        } catch (SQLException e) {
          e.printStackTrace();
        }

        break;
      case 3:
        System.out.print("Please enter new City: ");
        String City = sc.nextLine();
        try {
          PreparedStatement pst = cn.prepareStatement(
            "update student_db.students set sCity = ? where sid = ?"
          );
          pst.setString(1, City);
          pst.setInt(2, sId);
          pst.executeUpdate();
        } catch (SQLException e) {
          e.printStackTrace();
        }

        break;
      default:
        System.out.println("Please enter a valid input");
        break;
    }
  }
}
