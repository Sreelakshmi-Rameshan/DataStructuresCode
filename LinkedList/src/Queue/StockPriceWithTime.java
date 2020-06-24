package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * You are given stock prices and the corresponding day of each stock price. For
 * example:(32, 1), (45, 1), (37,2), (42,3), ..Here, 32 is the price and 1 is
 * the day of the price. Say you are given these prices as an input stream. You
 * should provide a function for the user to input a stock price and day. Your
 * system should be able to tell the maximum stock price in the last 3 days.
 * 
 * @author Sri
 *
 */
public class StockPriceWithTime {
	Queue<Price> q;
	int window;

	public StockPriceWithTime(int windowDays) {
		q = new LinkedList<>();
		window = windowDays;
	}

	public void addPrice(int price, int day) {
		while (!q.isEmpty() && q.peek().getDay() < (day - window + 1))
			q.remove();
		q.add(new Price(price, day));
	}

	public int getMax() {
		int maxPrice = 0;
		Iterator<Price> i = q.iterator();
		while (i.hasNext()) {
			int price = ((Price) i.next()).getPrice();
			if (price > maxPrice)
				maxPrice = price;
		}
		return maxPrice;
	}
}
