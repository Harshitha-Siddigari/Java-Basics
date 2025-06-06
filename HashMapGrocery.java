package javaproject1;

import java.util.HashMap;

public class HashMapGrocery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> grocery=new HashMap<String,Integer>();
		grocery.put("apples",40);
		grocery.put("milk",50);
		grocery.put("mango",50);
		grocery.put("bread",70);
		grocery.put("jam",30);
		int totalcost=0;
		for(int cost:grocery.values()) {
			totalcost+=cost;
		}
		System.out.println("totalcost of items is"+" "+totalcost);
		grocery.put("milk",grocery.get("milk")+20);
		System.out.println(grocery);
		System.out.println(grocery.remove("milk",70));
		System.out.println(grocery);
		

	}

}
