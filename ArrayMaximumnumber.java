package javaproject1;

import java.util.Scanner;

public class ArrayMaximumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of numbers");
		int size=sc.nextInt();
		int[] numbers=new int[size];
		System.out.println("enter numbers");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		int max=numbers[0];
		for(int i=1;i<size;i++){
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println("biggest"+max);
		sc.close();

	}

}
