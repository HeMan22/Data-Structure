package binarySearchTree;

public class BSTInsertion {

	/* Class containing left and right
    child of current node and key value */
	class Node{
		int key;
		Node left,right;
		
		public Node(int item) {
			key=item;
			left=right=null;
		}
	}
	
	// Root of BST
			Node root;
	
	BSTInsertion(){
		root=null;
	}
}
