package javaproject1;
import java.util.*;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {8,7,6,5,4,2};
		System.out.println(number);
		int start=0;
		int end=number.length-1;
		while(start<end) {
			int temp=number[start];
			number[start]=number[end];
			number[end]=temp;
			start++;
			end--;
			
		}
		System.out.println(number);

	}

}
