package javaproject1;
import java.util.Scanner;

public class inputex {
	    public static void main (String []args) {
	    	Scanner sc =new Scanner(System.in);
	    	System.out.println("enter the age:");
	    	int age=sc.nextInt();
	    	sc.nextLine();
	    	System.out.println("enter the name:");
	    	String name=sc.nextLine();
	    	System.out.println(name+age);
	    	}
	}

