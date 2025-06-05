package javaproject1;
import java.util.*;

public class Treesetids {

	public static void main(String[] args) {
		TreeSet<Integer> bookids=new TreeSet<>();
		bookids.add(5002);
		bookids.add(4998);
		bookids.add(5005);
		bookids.add(4999);
		bookids.add(5001);
		
		System.out.println(bookids.higher(4999));
		System.out.println(bookids.lower(5005));
		System.out.println(bookids.getFirst());
		System.out.println(bookids.getLast());
		
	}

}
