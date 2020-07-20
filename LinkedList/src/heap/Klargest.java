package heap;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Klargest {

	public static void printKSmallest(int[]a,int k)
	{
		if(k>a.length)
		{
			System.out.println("Error");
		}
		PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < a.length; i++)
		{
			if (i < k)
				heap.add(a[i]);
			else if (a[i] < heap.peek())
			{
				heap.remove();
				heap.add(a[i]);
			}
		}
		Iterator<Integer> iter = heap.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			}
	}
}
