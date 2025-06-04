package javaproject1;
import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {

		public static void main(String[] args) {
			Queue<String> students=new LinkedList<String>();
			students.add("Student 1");
			students.add("Student 2");
			students.add("Student 3");
			students.add("Student 4");
			students.add("Student 5");
			System.out.println(students);
			String firstOut=students.remove();
			System.out.println(firstOut);
			System.out.println(students);

		}

	}


