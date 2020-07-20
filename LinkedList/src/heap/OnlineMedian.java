package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class OnlineMedian {
	private static PriorityQueue<Integer> low;
	private static PriorityQueue<Integer> high;

	public OnlineMedian() {
		low = new PriorityQueue<Integer>(Collections.reverseOrder());
		high = new PriorityQueue<Integer>();
	}

	public static double getMedian() {
		if (low.size() == 0 && high.size() == 0)
			System.out.println("Error");
		if (low.size() == high.size())
			return low.peek() + (high.peek() - low.peek()) / 2.0;
		return high.peek();
	}

	public static void insert(int number) {
		if (high.isEmpty()) {
			high.add(number);
			return;
		}
		if (low.size() == high.size()) {
			if (number < low.peek()) {
				high.add(low.remove());
				low.add(number);
			} else {
				high.add(number);
			}
		} else {
			if (number > high.peek()) {
				low.add(high.remove());
				high.add(number);
			} else {
				low.add(number);
			}
		}
	}
}
