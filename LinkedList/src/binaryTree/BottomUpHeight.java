package binaryTree;
/**
 * Find the height of a binary tree
 * @author Sri
 *
 */
public class BottomUpHeight {
public static int height(TreeNode root)
{
	if(root==null)
	{
		return -1;
	}
	return Math.max(height(root.getLeft()),height(root.getRight()))+1;
}
}
