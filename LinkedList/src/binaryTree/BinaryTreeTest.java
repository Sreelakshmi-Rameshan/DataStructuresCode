package binaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		TreeNode one=new TreeNode();
		TreeNode two=new TreeNode();
		TreeNode three=new TreeNode();
		TreeNode four=new TreeNode();
		TreeNode five=new TreeNode();
		TreeNode six=new TreeNode();
		TreeNode seven=new TreeNode();
		
		one.setData(1);
		one.setLeft(null);
		one.setRight(null);
		one.setVisited(false);
		two.setData(2);
		two.setLeft(one);
		two.setRight(three);
		two.setVisited(false);
		three.setData(3);
		three.setLeft(null);
		three.setRight(null);
		three.setVisited(false);
		four.setData(4);
		four.setLeft(two);
		four.setRight(six);
		four.setVisited(false);
		five.setData(5);
		five.setLeft(null);
		five.setRight(null);
		five.setVisited(false);
		six.setData(6);
		six.setLeft(five);
		six.setRight(seven);
		six.setVisited(false);
		seven.setData(7);
		seven.setLeft(null);
		seven.setRight(null);
		seven.setVisited(false);
		
		/*Traversal.inOrder(four);
		Traversal.postOrder(four);
		Traversal.preOrder(four);
		TraversalUsingStack.InOrder(four);*/
		
		/*System.out.println(BottomUpHeight.height(four));
		PrintPaths.printPath(four);*/
		
		/*System.out.println(BottomUpHeight.height(four));
		System.out.println(BalancedTree.IsBalanced(four));*/
		
		
	}

}
