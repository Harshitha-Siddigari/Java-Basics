package javaproject1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number N");
		int num=sc.nextInt();
		int first=0;
		int second=1;
		for(int i=1;i<=num;i++) {
			System.out.println(first+" ");
		
		int next=first+second;
		first=second;
		second=next;
		}
		sc.close();
		

	}

}
