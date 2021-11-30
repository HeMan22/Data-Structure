package binarySearchTree;

public class BSTSearch {

	class Node {
		int key;
		Node right, left;

		public Node(int item) {
			key = item;
			right = left = null;
		}
	}

	// Root of BST
	Node root;

	BSTSearch() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}
		if(key <root.key)
			root.left=insertRec(root.left,key);


		return null;
	}
}
