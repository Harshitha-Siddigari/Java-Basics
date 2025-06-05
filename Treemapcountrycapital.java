package javaproject1;

import java.util.TreeMap;

public class Treemapcountrycapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> councap=new TreeMap<>();
		councap.put("india", "new delhi");
		councap.put("usa","washington");
		councap.put("germany","berlin");
		councap.put("japan","tokyo");
		councap.put("india","delhi");
		System.out.println(councap);
		System.out.println(councap.firstEntry());
		System.out.println(councap.lastEntry());
		System.out.println(councap.higherKey("india"));
		System.out.println(councap.lowerEntry("japan"));
		

	}

}
