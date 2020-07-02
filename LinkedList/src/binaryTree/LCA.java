package binaryTree;
/**
 * Given 2 nodes of a tree, find their lowest common ancestor (LCA).
 *  Assume that each node has a parent pointer
 * @author Sri
 *
 */
public class LCA {
public static TreeNode findLCA(TreeNode a,TreeNode b)
{
	if(a==null || b==null)
	{
		System.out.println("Null Exception");
	}
	
	TreeNode aPointer=a;
	TreeNode bPointer=b;
	
	int aDepth=-1;
	while(aPointer!=null)
	{
		aDepth++;
		aPointer=aPointer.getParent();
	}
	
	int bDepth=-1;
	while(bPointer!=null)
	{
		bDepth++;
		bPointer=bPointer.getParent();
	}
	
	TreeNode x=aDepth>bDepth?a:b;

for(int i=0;i<Math.abs(aDepth-bDepth);i++)
{
	x=x.getParent();
}
//to assign the other node to y, reverse the value
TreeNode y=aDepth>bDepth?b:a;
while(x!=y)
{
	x=x.getParent();
	y=y.getParent();
}
return x;
}

}