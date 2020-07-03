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
	
	//print stack on reaching leaf node i.e node.left and node.right is empty
	if(current.getLeft()==null && current.getRight()==null)
	{
		Stack<TreeNode> stackbuffer=new Stack<>();
		System.out.println();
		while(!stack.isEmpty())
		{
		System.out.println(stack.peek().getData());
		stackbuffer.push(stack.pop());
		}
		while(!stackbuffer.isEmpty())
		{
		stack.push(stackbuffer.pop());
		}
		
	}
	printAllPaths(current.getLeft(), stack);
	printAllPaths(current.getRight(), stack);
	stack.pop();
	
	
}
}
