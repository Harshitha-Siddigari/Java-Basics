package javaproject1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class HashsettoArraylist {

	public static void main(String[] args) {
		HashSet<String> students=new HashSet<String>();
		students.add("kamal");
		students.add("latha");
		students.add("kamal");
		students.add("jai");
		students.add("malini");
		System.out.println(students);
        Iterator<String> iterator = students.iterator();
        System.out.println("Iterating over HashSet:");
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
		
	}
        ArrayList<String> list = new ArrayList<>(students);
        System.out.println("ArrayList: " + list);

}
}
