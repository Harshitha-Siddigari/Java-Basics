package javaproject1;
import java.util.Scanner;

public class ifelsescanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String text=sc.nextLine();
		if(text.equals("yes")) {
			System.out.println("take an umbrella");
		}
		else {
			System.out.println("no need of umbrella");
		}

	}

}
