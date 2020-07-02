package binaryTree;

public class Traversal {
public static void preOrder(TreeNode n)
{
	if(n==null)
	{
		 return;
	}
	System.out.println(n.getData());
	preOrder(n.getLeft());
	preOrder(n.getRight());
}
public static void inOrder(TreeNode n)
{
	if(n==null)
	{
		return;
	}
	inOrder(n.getLeft());
	System.out.println(n.getData());
	inOrder(n.getRight());
}
public static void postOrder(TreeNode n)
{
	if(n==null)
	{
		return;
	}
	postOrder(n.getLeft());
	postOrder(n.getRight());
	System.out.println(n.getData());
}
}
