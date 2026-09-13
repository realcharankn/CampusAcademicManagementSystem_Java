package session11;
import java.util.Scanner;
public class Implementation {
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter internal marks : ");
		int internalmarks = sc.nextInt();
		System.out.print("Enter external marks: ");
		int externalmarks= sc.nextInt();
		if ((internalmarks>=40 && internalmarks<=60)) {
		}if ((externalmarks>=30 && externalmarks<=60)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed ");
		}
	}
}