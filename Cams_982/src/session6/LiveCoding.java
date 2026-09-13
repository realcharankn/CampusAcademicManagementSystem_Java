package session6;
import java.util.Scanner;
public class LiveCoding {
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter internal marks : ");
		int externalmarks= sc.nextInt();
		System.out.print("Enter external marks : ");
		int internalmarks= sc.nextInt();
		int totalmarks=internalmarks+externalmarks;
		System.out.println("External marks = " + externalmarks);
		System.out.println("Internal marks = " + internalmarks);
		System.out.println("Is total marks more than 50 and external marks more than 30?");
		System.out.println(totalmarks>=50 && externalmarks>=30);
		int finalmarks = totalmarks+5;
		System.out.print("Result status : ");
		System.out.println(finalmarks>=50 && externalmarks>=30 ? "u r done" : "Fail");
	}
}
