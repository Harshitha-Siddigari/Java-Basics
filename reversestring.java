package javaproject1;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		
		String original=sc.nextLine();
		String reversed=new StringBuilder(original).reverse().toString();
		System.out.println(original);
		System.out.println(reversed);
		
		

	}

}
