package stackImplementaion;

import LinkListImpl.Node;

import java.util.Stack;

import LinkListImpl.LinkedList;

public class StackImplement {
	LinkedList list = new LinkedList(null, null);
/**
 * Function is used to push the values into a stack
 * @param value is the data to be pushed into the stack
 */
	public void push(int value) {
		Node temp = new Node(value, null);
		System.out.println("pushing value" + value);
		temp.setData(value);
		temp.setNext(list.head);
		list.head = temp;
	}
/**
 * Function is used to view the element in stack
 * @return the integer data present at the top of stack. if stack is empty , returns -1
 */
	public int peek() {

		if (list.head != null) {
			return list.head.getData();
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
/**
 * Function is used to remove data from a stack
 */
	public void pop() {
		if (list.head == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		System.out.println("Removing " + peek());
		list.head = list.head.getNext();
	}

	public static void main(String[] args) {
		
		StackImplement stack = new StackImplement();
		stack.push(2);
		stack.push(3);
		stack.push(7);
		Stack <Integer> s=new Stack<>();
		s.push(6);
		s.push(8);
		s.push(35);
		s.push(67);
		System.out.println(StackProblems.find(69, s));
		stack.pop();
		System.out.println("Top element is " + stack.peek());
		stack.pop();
		stack.pop();
		System.out.println("Top element is " + stack.peek());

	}

}
