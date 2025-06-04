package javaproject1;
import java.util.Stack;

public class Stack1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Stack<String> burgerStack=new Stack<String>();
			burgerStack.push("Burger 1");
			burgerStack.push("Burger 2");
			burgerStack.push("Burger 3");
			System.out.println("Top burger is"+burgerStack.peek());
			System.out.println("serving"+burgerStack.pop());
			if(burgerStack.isEmpty()) {
				System.out.println("all burgers is served");
				
			}

		}
}
