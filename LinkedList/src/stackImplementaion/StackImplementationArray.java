package stackImplementaion;

import java.util.EmptyStackException;

public class StackImplementationArray {

	private int arr[];
	private int size;
	private int index = 0;

	public StackImplementationArray(int size) {
		this.size = size;
		arr = new int[size];
	}

	/**
	 * push an element into the stack
	 * 
	 * @param element
	 *            The value to be inserted
	 */
	public void push(int element) {

		if (isFull()) {
			throw new StackOverflowError("Stack is full");
		}

		arr[index] = element;
		index++;
	}

	/**
	 * pop an element from stack
	 * 
	 * @return the popped element
	 */
	public int pop() {

		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return arr[--index];
	}

	public boolean isEmpty() {
		if (index == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (index == size) {
			return true;
		}
		return false;
	}

	public int size() {
		return index;
	}

	public static void main(String[] args) {

		/*StackImplementationArray stack = new StackImplementationArray(5);
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		// stack.push(0);

		System.out.println("1. Size of stack after push operations: " + stack.size());

		System.out.printf("2. Pop elements from stack : ");
		while (!stack.isEmpty()) {
			System.out.printf(" %d", stack.pop());
		}

		System.out.println("\n3. Size of stack after pop operations : " + stack.size());*/
	}
}
