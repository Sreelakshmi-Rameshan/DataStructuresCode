package binaryTree;

import java.util.Stack;
/**
 * Given a Binary Tree, print all paths from root to leaf.
 * @author Sri
 *
 */
public class PrintPaths {
public static void printPath(TreeNode root)
{
	printAllPaths(root, new Stack<TreeNode>());
}

private static void printAllPaths(TreeNode current, Stack<TreeNode> stack) {
	if(current==null)
	{
		return;
	}
	stack.push(current);
	if(current.getLeft()==null && current.getRight()==null)
	{
		System.out.println(stack);
	}
	printAllPaths(current.getLeft(), stack);
	printAllPaths(current.getRight(), stack);
	stack.pop();
	
	
}
}
