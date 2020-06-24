package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement a Queue with O(1) lookup of the Maximum element.
 * 
 * @author Sri
 *
 */
public class FindMax {
	Queue<Integer> main;
	Deque<Integer> max;

	public FindMax() {
		main = new LinkedList<>();
		max = new LinkedList<>();
	}

	public void enqueue(int item) {
		main.add(item);
		while (!max.isEmpty() && max.getLast() < item)
			max.removeLast();
		max.add(item);
	}

	public void dequeue() {
		if (main.isEmpty())
			System.out.println("Queue is empty");
		int item = main.remove();
		if (max.getFirst() == item)
			max.remove();
	}

	public int findMax() {
		if (max.isEmpty())
			System.out.println("Queue is empty");
		return max.getFirst();
	}
}
