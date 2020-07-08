package BinarySearchTree;

import LinkListImpl.Node;
import binaryTree.TreeNode;
/**
*Given a linked list whose nodes are sorted,turn it into a binary search tree
 * @author Sri
 *
 */
public class TreeConstructLL {
	public static TreeNode Construct(Node head, Node tail) {
		if (head == null || tail == null) {
			return null;
		}
		MedianPair median = findMedian(head, tail);
		TreeNode root = new TreeNode();
		root.setData(median.getMedian().getData());
		root.setLeft(Construct(head, median.getPrevious()));
		root.setRight(Construct(median.getMedian().getNext(), tail));
		return root;
	}

	private static MedianPair findMedian(Node head, Node tail) {
		if (head == null || tail == null) {
			return null;
		}
		Node fast = head, slow = head, slowPrevious = null;
		while (fast != tail) {
			fast = fast.getNext();
			if (fast != tail) {
				fast = fast.getNext();
				slowPrevious = slow;
				slow = slow.getNext();
			}
		}
		return new MedianPair(slow, slowPrevious);
	}
}
