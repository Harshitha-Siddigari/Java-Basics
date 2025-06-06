package javaproject1;

import java.util.Stack;

public class Stackactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> actions=new Stack<String>();
		actions.push("write");
		actions.push("delete");
		actions.push("insert");
		System.out.println(actions.peek());
		System.out.println(actions.pop());
		System.out.println(actions.pop());
		System.out.println(actions);

	}

}
