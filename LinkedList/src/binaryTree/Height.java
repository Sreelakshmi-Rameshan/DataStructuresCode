package binaryTree;

public class Height {
public static int getHeight(TreeNode root)
{
	int prevDepth=-1;
	int maxDepth=-1;
	height(root,maxDepth,prevDepth);
	return maxDepth;
}
	public static void height(TreeNode node,int maxDepth,int prevDepth)
	{
		int currDepth=prevDepth+1;
		if(currDepth>maxDepth)
		{
			maxDepth=currDepth;
			height(node.getLeft(), currDepth, maxDepth);
			height(node.getRight(), currDepth, maxDepth);
		}
				
	}

}
