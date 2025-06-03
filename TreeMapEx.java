package javaproject1;
import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Integer> marks=new TreeMap<>();
		marks.put(1, 45);
		marks.put(2, 67);
		marks.put(3, 89);
		marks.put(4, 67);
		marks.put(5, 90);
		 if(marks.containsKey(5)) {
			 System.out.println("yes");
		 }else {
			 System.out.println("no");
		 }
		System.out.println(marks);
		 
       TreeMap<String,Long> phbook=new TreeMap<String,Long>();
       phbook.put("hi",7827678932L);
       phbook.put("hello",78905432L);
       phbook.put("kee",6789432L);
       System.out.println(phbook);
	}
}
       
       


