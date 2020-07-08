package BinarySearchTree;
/**
 * Given a sorted array,build a balanced binary search tree
 * @author Sri
 *
 */
public class TreeReconstruction {
public static Node ConstructTree(int a[],int start,int end)
{
	if(start>end||check(a,start)||check(a,end))
	{
		return null;
	}
	int mid=(start+end)/2;
	
	Node root=new Node() ;
	root.setData(a[mid]);
	root.setLeft(ConstructTree(a, start, mid-1));
	root.setRight(ConstructTree(a, mid+1, end));
	return root;
}

private static boolean check(int[] a, int index) {
	return index<0 ||index>a.length;
}
}
