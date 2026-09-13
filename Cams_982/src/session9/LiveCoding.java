package session9;

import java.util.Scanner;

public class LiveCoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student 1 ID: ");
        int id1 = sc.nextInt();
        System.out.print("Enter Student 1 Semester: ");
        byte sem1 = sc.nextByte();
        System.out.print("Enter Student 1 CGPA: ");
        double cgpa1 = sc.nextDouble();
        System.out.println("Student 1 registered successfully!");
        System.out.print("Enter Student 2 ID: ");
        int id2 = sc.nextInt();
        System.out.print("Enter Student 2 Semester: ");
        byte sem2 = sc.nextByte();
        System.out.print("Enter Student 2 CGPA: ");
        double cgpa2 = sc.nextDouble();
        System.out.println("Student 2 registered successfully!");
        System.out.println("===== STUDENT REGISTRATION DETAILS =====");
        System.out.printf( "%-15s%-10s%-7s%n","Student ID", "Semester", "CGPA");
        System.out.println("----------------------------------------");
        System.out.printf("%-15d%-12d%-7f%n", id1, sem1, cgpa1);
        System.out.printf("%-15d%-12d%-7f%n", id2, sem2, cgpa2);
        System.out.println("----------------------------------------");
        System.out.println("Registration Completed Successfully");
        sc.close();
    }
}