package javaproject1;
import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> students=new HashMap<Integer,String>();
		students.put(1,"sai");
		students.put(2,"raju");
		students.put(3,"rani");
		students.put(4,"dhanu");
		students.put(5,"dinesh");
		students.remove(3);
		if(students.containsKey(4)) {
			System.out.println("4 is present");
		}else {
			System.out.println("4 is not present");
		}
		students.put(7,"raju");
		System.out.println(students);
		

	}

}
