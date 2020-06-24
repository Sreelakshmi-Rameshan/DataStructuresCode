package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 * Given an array of integers A, find the sum of each sliding window of size K.
 * @author Sri
 *
 */
public class SlidingWindow {
	public static void slidingWindowSum(int[] a, int k)
	{
		if(a==null ||k<=0 ||a.length==0)
		{
			return;
		}
		Queue<Integer> q = new LinkedList<>();
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			if(q.size()==k)
			{
				int last=q.remove();
				sum-=last;
			}
			q.add(a[i]);
			sum+=a[i];
			if(q.size()==k)
			{
				System.out.println(sum);
			}
		}
	}
	public static void main(String[] args)
	{
		int [] arr=new int[5];
		arr[0]=3;
		arr[1]=2;
		arr[2]=1;
		arr[3]=4;
		slidingWindowSum(arr,3);
	}
}
