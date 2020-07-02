package binaryTree;

public class LCANoParent {
public static TreeNode findLCA(final TreeNode n,final TreeNode a,final TreeNode b)
{
	if(a==n && b==n)
	{
		return n;
	}
	
	TreeNode leftLCA=findLCA(n.getLeft(), a, b);
	TreeNode rightLCA=findLCA(n.getRight(), a, b);
	
	if(leftLCA!=null && rightLCA!=null)
	{
		return n;
	}
	return leftLCA!=null? leftLCA:rightLCA;
	
}
}
