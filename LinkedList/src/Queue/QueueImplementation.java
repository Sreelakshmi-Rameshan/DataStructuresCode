package Queue;
/**
 * Queue Implementation
 * @author Sri
 *length: number of elements present in the array
 */
public class QueueImplementation {
	 int[] a;
	 int front;
	 int back;
	 int length;
	 public void Queue(int capacity)
	 {
		 a = new int[capacity];
		 front = 0;
		 back = 0;
		 length = 0;
		 }
	 public void add(int item)
	 {
		 if (length == a.length)
		 {
			 System.out.println("Queue full");
		 }
		 a[back] = item;
		 back = (back + 1) % a.length;
		 length++;
		 }
	 public int remove() 
	 {
		 if (length == 0)
			 System.out.println("Queue is empty");
		 int result = a[front];
		 front = (front + 1) % a.length;
		 length--;
		 return result;
		 }
	
}
