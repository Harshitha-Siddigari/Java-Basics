package javaproject1;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.*;

public class Treesetproduct {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a product name");
		String input1=input.nextLine();
		TreeSet<String> product=new TreeSet<String>();
		product.add("keyboard");
		product.add("mouse");
		product.add("monitor");
		product.add("cpu");
		product.add("webcam");
		if(product.contains(input1)) {
			System.out.println("exists");
		}
		else {
			System.out.println("not exists");
		}
		input.close();
		
	}

}
