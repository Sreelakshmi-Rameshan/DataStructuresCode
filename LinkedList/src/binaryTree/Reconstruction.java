package binaryTree;

import java.util.HashMap;

public class Reconstruction {
	public static TreeNode Reconstruct(int[] inorder, int[] preorder) {
		HashMap<Integer, Integer> inorderMap = InOrderMap(inorder);
		TreeNode root = Construct(inorder, 0, inorder.length, preorder, 0, preorder.length, inorderMap);
		return root;
	}

	private static TreeNode Construct(int[] inorder, int inorderStart, int inorderEnd, int[] preorder,
			int preorderStart, int preorderEnd, HashMap<Integer, Integer> inorderMap) {
		if (inorderStart > inorderEnd || preorderStart > preorderEnd) {
			return null;
		}
		// setting the root node
		int rootValue = preorder[preorderStart];
		TreeNode root = new TreeNode();
		root.setData(rootValue);

		 /*find the root index in inorder so as to obtain left and right subtree. Use
		hashmap to get the index*/
		int k = inorderMap.get(rootValue);
		
		/* preorderStart+(k-inorderStart) : gives the number of elements in preorder
		left subtree using inorder know value before root element*/
		root.left = Construct(inorder, inorderStart, k - 1, preorder, preorderStart + 1,
				preorderStart + (k - inorderStart), inorderMap);

		root.right = Construct(inorder, k + 1, inorderEnd, preorder, preorderStart + (k - inorderStart) + 1,
				preorderEnd, inorderMap);
		return root;
	}

	private static HashMap<Integer, Integer> InOrderMap(int[] inorder) {
		HashMap<Integer, Integer> inOrderMap = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			inOrderMap.put(inorder[i], i);
		}
		return inOrderMap;
	}
}
