package stackImplementaion;

import java.util.EmptyStackException;
import java.util.Stack;

public class FindMaxElement {
	Stack<Integer> main;
	Stack<Integer> max;

	public FindMaxElement() {
		main = new Stack<>();
		max = new Stack<>();
	}

	public void push(int value) {
		main.push(value);
		if (max.isEmpty() || value >= max.peek()) {
			max.push(value);
		}
	}

	public int max() throws EmptyStackException {
		if (max.isEmpty())
			throw new EmptyStackException();
		return max.peek();
	}

	public int pop() throws EmptyStackException {
		if (main.isEmpty())
			throw new EmptyStackException();
		int item = main.pop();
		if (max.peek() == item)
			max.pop();
		return item;
	}
}
