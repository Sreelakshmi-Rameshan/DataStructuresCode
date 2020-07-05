package BinarySearchTree;
/**
 * Is BST: Given a Binary Tree, determine if it is a Binary Search Tree (BST).
 * @author Sri
 *
 */
public class BSTree {
	/**
	 * 
	 * @param root : root node
	 * @return min and max value if the tree is Binary Search tree,else return null
	 */
	public static MinMaxPair isBST(Node root) {
		if (root == null)

			return new MinMaxPair(Integer.MAX_VALUE, Integer.MIN_VALUE);
		MinMaxPair left = isBST(root.getLeft());
		MinMaxPair right = isBST(root.getRight());
		if (left == null || right == null)
			return null;
		if (left.getMax() > root.getData() || right.getMin() < root.getData()) {
			return null;
		}
		int min = root.getLeft() == null ? root.data : left.getMin();
		int max = root.getRight() == null ? root.data : right.getMax();
		return new MinMaxPair(min, max);
	}
}
