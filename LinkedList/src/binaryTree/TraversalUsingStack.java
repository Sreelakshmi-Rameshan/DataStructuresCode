package binaryTree;

import java.util.Stack;
/**
 * while using stack, the order of pushing nodes to stack is in reverse i.e
 * inorder: right,current,left
 * postorder:current,right,left
 * preorder:right,left,current
 * @author Sri
 *
 */
public class TraversalUsingStack {
	public static void InOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> traverse = new Stack<TreeNode>();
		traverse.push(root);
		while (!traverse.isEmpty()) {
			TreeNode current = traverse.pop();
			if (current.isVisited())
				System.out.println(current.getData());
			else {
				current.setVisited(true);
				// for post-order push initially
				// traverse.push(current);
				if (current.getRight() != null)
					traverse.push(current.getRight());
				// in-order push in between left and right
				traverse.push(current);
				if (current.getLeft() != null)
					traverse.push(current.getLeft());
				// pre-order push current in the end
				// traverse.push(current);
			}
		}
	}
}
