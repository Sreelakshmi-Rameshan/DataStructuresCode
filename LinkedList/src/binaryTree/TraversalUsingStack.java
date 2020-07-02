package binaryTree;

import java.util.Stack;

public class TraversalUsingStack {
public static void InOrder(TreeNode root)
{
	if(root==null)
	{
		return;
	}
	Stack<TreeNode> traverse=new Stack<TreeNode>(); 
	traverse.push(root);
	while(!traverse.isEmpty())
	{
		TreeNode current=traverse.pop();
		if(current.isVisited())
			System.out.println(current.getData());
		else
		{
			if(current.getLeft()!=null)
				traverse.push(current.getLeft());
			traverse.push(current);
			if (current.getLeft() != null)
				traverse.push(current.getLeft());
			}
		}
	}
}

