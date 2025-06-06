package javaproject1;

import java.util.ArrayList;

public class ArrayListcartoon {

	public static void main(String[] args) {
		ArrayList<String> cartoon=new ArrayList<String>();
		cartoon.add("h");
		cartoon.add("b");
		cartoon.add("c");
		cartoon.add("m");
		cartoon.add("p");
		System.out.println(cartoon.remove(3));
		System.out.println(cartoon);
		cartoon.set(2,"j");
		System.out.println(cartoon);
		for(String cartoon1:cartoon) {
			System.out.println(cartoon1);
		}
		cartoon.sort(null);
		System.out.println(cartoon);
	}

}
