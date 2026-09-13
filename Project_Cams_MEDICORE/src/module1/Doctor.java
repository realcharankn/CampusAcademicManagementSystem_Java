package module1;

import java.util.Scanner;

public class Doctor {
	    int doctorid;
	    String doctorname;
	    String specialization;
	    boolean availability;
	    int assignedpatientid;
	    public void addDoctor(int id, String name, String spec, boolean avail) {
	        doctorid = id;
	        doctorname = name;
	        specialization = spec;
	        availability = avail;
	        assignedpatientid = 0;
	    }
	    public void assignDoctor(int patientid) {
	        if (availability) {
	            assignedpatientid = patientid;
	            availability = false;
	            System.out.println("Doctor " + doctorname + " assigned to patient ID: " + patientid);
	        } else {
	            System.out.println("Doctor " + doctorname + " is currently unavailable.");
	        }
	    }
	    public void updateAvailability(boolean status) {
	        availability = status;
	    }
	    public void displayDoctor() {
	        System.out.println("Doctor ID: " + doctorid);
	        System.out.println("Doctor Name: " + doctorname);
	        System.out.println("Specialization: " + specialization);
	        System.out.println("Availability: " + availability);
	        System.out.println("Assigned Patient ID: " + assignedpatientid);
	    }
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
        Doctor doc = new Doctor();
        System.out.print("Enter Doctor ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Specialization: ");
        String spec = scanner.nextLine();
        System.out.print("Enter Availability (true/false): ");
        boolean avail = scanner.nextBoolean();
        doc.addDoctor(id, name, spec, avail);
        System.out.println("==============================");
        System.out.println("Doctor Details:");
        doc.displayDoctor();
        System.out.println("==============================");
        System.out.print("Enter Patient ID to assign: ");
        int patientid = scanner.nextInt();
        doc.assignDoctor(patientid);
        System.out.println("Updated Doctor Details:");
        doc.displayDoctor();
        System.out.println("==============================");
        scanner.close();
        }
}
