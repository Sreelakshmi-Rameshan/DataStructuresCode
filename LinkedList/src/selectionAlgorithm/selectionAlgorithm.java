package selectionAlgorithm;

import java.util.*;

public class selectionAlgorithm {
	public static int FindkthElement(int[] a, int k) {
		if (a == null || a.length == 0 || k < 0 || k > a.length) {
			System.out.println("error");
		}
		return FindkthHelper(a, k-1, 0, a.length-1);
	}

	private static int FindkthHelper(int[] a, int target, int start, int end) {
		int randomElement = FindRandom(start, end);
		int pivotIndex = PartitionArray(a, start, end, randomElement);
		if (pivotIndex == target) {
			return a[pivotIndex];
		} else if (pivotIndex > target) {
			return PartitionArray(a, start, pivotIndex - 1, target);
		} else
			return PartitionArray(a, pivotIndex + 1, end, target);

	}

	private static int PartitionArray(int[] a, int start, int end, int randomIndex) {
		swap(a, start, randomIndex);
		int less = start;
		for (int i = start+1; i <= end; i++) {
				if (a[i] <= a[start])
					swap(a, i, ++less);
			}
		swap(a, start, less);
		return less;
	}

	private static void swap(int[] a, int start, int randomIndex) {
		int temp = a[start];
		a[start] = a[randomIndex];
		a[randomIndex] = temp;
	}

	private static int FindRandom(int start, int end) {
		if (start > end)
			System.out.println();
		return new Random().nextInt(end - start + 1) + start;
	}
	public static void main(String[] args)
	{
		int[] arr; 
        
	      arr = new int[5]; 
	          
	      arr[0] = 8;  
	      arr[1] = 4; 
	      arr[2] = 3; 
	      arr[3] = 9; 
	      arr[4] = 7; 
	    System.out.println(FindkthElement(arr,1)); 
}
}
