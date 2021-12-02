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
		if(key>root.key)
			root.right=insertRec(root.right,key);

		return root;
	}
	
	boolean search(Node root, int key) {
		if(root==null)
			return false;
		else if(root.key==key)
			return true;
		else if(key>root.key)
			search(root.right,key);
		else if(key<root.key)
			search(root.left,key);
			
		return false;
	}
}
