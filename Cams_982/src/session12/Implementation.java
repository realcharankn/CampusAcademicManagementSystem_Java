package session12;
import java.util.Scanner;
public class Implementation {
	    public static void main(String[] arg) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("1. Student Registration\n"
	                + "2. Course Management\n"
	                + "3. Attendance Management\n"
	                + "4. Grade Calculation\n"
	                + "5. Search-Module\n"
	                + "6. Report Generation\n"
	                + "7. Student Data Analytics\n");
	                
	        System.out.print("Enter the button : ");
	        int button = sc.nextInt();
	        
	        switch(button) {
	            case 1: 
	                System.out.println("Student has selected Student Registration Module");
	                break;
	            case 2: 
	                System.out.println("Student has selected Course Management Module");
	                break;
	            case 3: 
	                System.out.println("Student has selected Attendance Management Module");
	                break;
	            case 4: 
	                System.out.println("Student has selected Grade Calculation Module");
	                break;
	            case 5: 
	                System.out.println("Student has selected Search Module");
	                break;
	            case 6: 
	                System.out.println("Student has selected Report Generation Module");
	                break;
	            case 7: 
	                System.out.println("Student has selected Student Data Analytics Module");
	                break;
	            default: 
	                System.out.println("Student should enter choice between 1-7 only");
	                break;
	        }
	        sc.close();
	    }
}    
