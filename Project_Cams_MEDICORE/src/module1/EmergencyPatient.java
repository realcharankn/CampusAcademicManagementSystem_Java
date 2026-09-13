package module1;
import java.util.Scanner;

public class EmergencyPatient {
    private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private String bloodGroup;
    private long mobileNumber;

    Scanner sc = new Scanner(System.in);
    public void registerPatient() {
        System.out.println("----- Register Emergency Patient -----");
        System.out.print("Enter Patient ID: ");
        patientId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
        System.out.print("Enter Blood Group: ");
        bloodGroup = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        mobileNumber = sc.nextLong();
        System.out.println("Patient registered successfully!\n");
    }
    public void updatePatient() {
        System.out.println("----- Update Patient Details -----");
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
        System.out.print("Enter Blood Group: ");
        bloodGroup = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        mobileNumber = sc.nextLong();
        System.out.println("Patient details updated successfully!\n");
    }
    public void displayPatient() {
        System.out.println("----- Patient Details -----");
        System.out.println("Patient ID     : " + patientId);
        System.out.println("Patient Name   : " + patientName);
        System.out.println("Age            : " + age);
        System.out.println("Gender         : " + gender);
        System.out.println("Blood Group    : " + bloodGroup);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("------------------------------");
    }
    public static void main(String[] args) {
        EmergencyPatient patient = new EmergencyPatient();
        patient.registerPatient();
        patient.displayPatient();
        patient.updatePatient();
        patient.displayPatient();
    }
}