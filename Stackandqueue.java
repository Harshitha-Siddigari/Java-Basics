package javaproject1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Stackandqueue {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>toy=new Stack<String>();
		toy.push("ball");
		toy.push("blocks");
		toy.push("puzzle");
		System.out.println("toptoy in the stack : "+toy.peek());
		System.out.println("top being played is:"+toy.pop());
		System.out.println(toy);
		Queue<String> icecream=new LinkedList<String>();
		icecream.add("maya");
		icecream.add("Leo");
		icecream.add("nina");
		System.out.println(icecream);
		String firstout=icecream.poll();
		System.out.println("serve the first kid :"+firstout);
		System.out.println(icecream);
	}

}
