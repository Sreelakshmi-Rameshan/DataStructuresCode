package binaryTree;

public class BalancedTree {
public static boolean IsBalanced(TreeNode root)
{
	return BalancedHelper(root)!= -1;
}

public static int BalancedHelper(TreeNode root) {
	if(root==null)
		return 0;
	int leftHeight=BalancedHelper(root.getLeft());
	int rightHeight=BalancedHelper(root.getRight());
	
	if(leftHeight==-1 || rightHeight==-1)
		return -1;
	if(Math.abs(leftHeight-rightHeight)>1)
	return -1;
	else
		return Math.max(leftHeight, rightHeight)+1;
}
}
