package BinarySearchTree;

/**
 * Find Successor: Given a Node N in a BST, find the node with the next largest value, 
 * also known as the successor of the node
 * @author Sri
 *
 */
public class FindSuccessor {
	public static Node findSuccessor(Node n, Node root) {
		if (n.getRight() != null) {
			Node current = n.getRight();
			while (current.getLeft() != null)
				current = current.getLeft();
			return current;
		} else {
			Node current = root, successor = null;
			while (current != null) {
				if (current.getData() > n.getData()) {
					successor = current;
					current = current.getLeft();
				} else if (current.getData() < n.getData()) {
					current = current.getRight();
				} else if (current == n) {
					break;
				}
			}
			return successor;
		}
	}
}
