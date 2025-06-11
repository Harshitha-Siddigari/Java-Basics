package javaproject1;

import java.util.Scanner;

public class simplecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number");
		double num1=input.nextDouble();
		System.out.println("enter second number");
		double num2=input.nextDouble();
		System.out.println("choose an operation(+,-,*,/):");
		char operators=input.next().charAt(0);
		double result;
		switch (operators) {
		case '+':
			result=num1+num2;
			System.out.println("result"+result);
			break;
		case '-':
			result=num1-num2;
			System.out.println("result"+result);
			break;
		case '*':
			result=num1*num2;
			System.out.println("result"+result);
		case '/':
			if(num2!=0) {
				result=num1/num2;
				System.out.println("result"+result);
			}else {
				System.out.println("error:cannot divide by zero");
			}
			break;
			default:
				System.out.println("invalid operator");
		

	}
input.close();
}
}
