package session8;
import java.util.Scanner;
public class Implementation {
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student ID : ");
		int studentId = sc.nextInt();
		System.out.print("Enter student Name : ");
        String name = sc.next();
        System.out.print("Enter coursename : ");
        String courseName = sc.next();
        System.out.print("Enter Semester : ");
        int semester = sc.nextInt();
        System.out.print("Enter Academic year : ");
        String academicYear = sc.next();
        System.out.print("Enter internal marks : ");
        double internalMarks = sc.nextDouble();
        System.out.print("Enter external marks : ");
        double externalMarks = sc.nextDouble();
        System.out.print("Entter your attendence percentage : ");
        double attendancePercentage = sc.nextDouble();
        System.out.print("Enter subject credits : ");
        int credits = sc.nextInt();

        double totalMarks = internalMarks + externalMarks;
        char grade;

        if (totalMarks >= 90) {
            grade = 'S';
        } else if (totalMarks >= 80) {
            grade = 'A';
        } else if (totalMarks >= 70) {
            grade = 'B';
        } else if (totalMarks >= 60) {
            grade = 'C';
        } else if (totalMarks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("===================================================================");
        System.out.println("======================    STUDENT DETAILS     =====================");
        System.out.println("===================================================================");
        System.out.println("Student ID            : " + studentId);
        System.out.println("Name                  : " + name);
        System.out.println("Course Name           : " + courseName);
        System.out.println("Semester              : " + semester);
        System.out.println("Academic Year         : " + academicYear);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Internal Marks        : " + internalMarks);
        System.out.println("External Marks        : " + externalMarks);
        System.out.println("Total Marks           : " + totalMarks);
        System.out.println("Attendance Percentage : " + attendancePercentage + "%");
        System.out.println("Credits               : " + credits);
        System.out.println("Grade                 : " + grade);
        System.out.println("===================================================================");
	}
}
