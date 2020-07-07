package BinarySearchTree;

/**
 * Given a BST that can contain duplicate elements,
 *  find the first occurrence of a number N
 * @author Sri
 *
 */
public class FindTarget {
public static Node findTarget(Node root,int target)
{
	Node current=root;
	Node result=null;
	while(current!=null)
	{
		if(current.getData()>target)
			current=current.getLeft();
		else if(current.getData()<target)
			current=current.getRight();
		else
		{
			result=current;
			current=current.getLeft();
		}
		}
	return result;
}
}
