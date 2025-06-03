package javaproject1;
import java.util.Scanner;

public class calender {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a weekday : ");
	        String day = scanner.nextLine().trim().toLowerCase();

	        switch (day) {
	        case "monday":
                System.out.println("lets learn python");
                break;
	        case "tuesday":
                System.out.println("lets learn java");
                break;
	        case "wednesday":
                System.out.println("lets learn C++");
                break;
	        case "thursday":
                System.out.println("lets learn sql");
                break;
	        case "friday":
                System.out.println("lets learn mango db");
                break;
	        case "saturday":
                System.out.println("lets learn html");
                break;
	        case "sunday":
                System.out.println("lets learn css");
                break;
            default:
            	System.out.println("invalid day you entered");
	        }
	        
	        }

}
