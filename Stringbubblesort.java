package javaproject1;

import java.util.ArrayList;

public class Stringbubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits=new ArrayList<>();
		fruits.add("grapes");
		fruits.add("banana");
		fruits.add("straw");
		fruits.add("promo");
		System.out.println(fruits);
		for(int i=0;i<fruits.size()-1;i++) {
			for(int j=0;j<fruits.size()-1;j++) {
				if(fruits.get(j).compareTo(fruits.get(j+1))>0) {
					String temp=fruits.get(j);
					fruits.set(j,fruits.get(j+1));
					fruits.set(j+1,temp);
					
				}
			}
		}
		
		System.out.println(fruits);
		

	}

}
