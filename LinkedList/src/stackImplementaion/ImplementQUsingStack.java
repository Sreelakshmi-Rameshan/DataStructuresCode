package stackImplementaion;

import java.util.Stack;

/**
 * Implement a Queue using 2 stacks.
 * 
 * @author Sri
 *
 * @param <A>
 */
public class ImplementQUsingStack<A> {
	Stack<A> s1;
	Stack<A> s2;

	public ImplementQUsingStack() {
		s1 = new Stack<A>();
		s2 = new Stack<A>();
	}

	public void enqueue(A a) {
		s1.push(a);
	}

	public A dequeue() throws EmptyQueueException {
		if (s2.isEmpty()) {
			FlushtoS2();
		}
		if (s2.isEmpty()) {
			throw new EmptyQueueException();
		}
		return s2.pop();
	}

	public void FlushtoS2() {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
	}

	public static void main(String[] args) {
		ImplementQUsingStack<Integer> s = new ImplementQUsingStack<Integer>();
		try {
			s.enqueue(56);
			s.enqueue(46);

			int dvalue = s.dequeue();
			System.out.println("dequeue value is " + dvalue);
		} catch (EmptyQueueException e) {
			e.printStackTrace();
		}

	}

}
