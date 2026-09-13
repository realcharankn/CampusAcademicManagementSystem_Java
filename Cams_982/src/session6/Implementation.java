package session6;
import java.util.Scanner;
public class Implementation {
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter previous attendence : ");
		double previousattendence = sc.nextDouble();
		System.out.println("Enter current attendence : ");
		double currentattendence = sc.nextDouble();
		
		double attendence = currentattendence-previousattendence;
		System.out.println(currentattendence>previousattendence && currentattendence>=75);
		System.out.println(currentattendence>previousattendence && currentattendence>=75);
		 
		System.out.println(attendence>75 ? "Eligible" : "Not Eligible");
	}
}
