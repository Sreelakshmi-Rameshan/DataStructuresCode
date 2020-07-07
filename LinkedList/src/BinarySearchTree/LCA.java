package BinarySearchTree;
/**
 * Lowest Common Ancestor: Given a Binary Search Tree and 2 nodes A and B, 
 * find their lowest common ancestor
 * @author Sri
 *
 */
public class LCA {
	public static Node findLCA(Node root, Node a, Node b) {
		Node current = root;
		while (current != null) {
			if (current.getData() < a.getData() && current.getData() < b.getData())
				current = current.getRight();
			else if (current.getData() > a.getData() && current.getData() > b.getData())
				current = current.getLeft();
			else
				return current;
		}
		return null;
	}

}
