package javaproject1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIcecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> kids=new LinkedList<String>();
		kids.add("kid 1");
		kids.add("kid 2");
		kids.add("kid 3");
		kids.add("kid 4");
		kids.add("kid 5");
		System.out.println(kids);
		String firstOut=kids.remove();
		System.out.println("first kid is"+firstOut);
		System.out.println(kids);
		kids.add("kid 6");
		System.out.println(kids);


	}

}
