package LinkedList;

public class LinkedListDeletion {

	Node head;

	private class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		LinkedListDeletion lld = new LinkedListDeletion();

		lld.insertAtBegin(5);
		lld.insertAtEnd(10);
		lld.insertAtBegin(12);
		lld.insertAtEnd(8);
		lld.insertAtBegin(50);
		lld.insertAtEnd(12);
		lld.print();

		lld.removeData(12); // Deleting FIrst Occurrence of the data
		lld.print();

		lld.removeNode(2); // Deleting Node at the given position
		lld.print();
	}

	private void insertAtBegin(int x) {

		Node temp = new Node(x);

		temp.next = head;
		head = temp;
	}

	private void insertAtEnd(int x) {

		Node temp = new Node(x);

		if (head == null) {
			head = temp;
		}
		Node current = head;

		while (current.next != null)
			current = current.next;

		// Now the Current Node reached End
		current.next = temp;

	}

	private void removeData(int key) {

		Node current = head;
		Node prev = null;

		// If Head Node itself holds the value to be deleted
		if (current != null && current.data == key) {
			// Change the head
			head = current.next;
			return;
		}

		while (current != null && current.data != key) {
			prev = current;
			current = current.next;
		}

		// If key is not present
		if (current == null) {
			System.out.println(key + ": Key is not present");
			return;
		}

		// Unlink the node from Linked List
		prev.next = current.next;

	}

	/*
	 * Given a reference (pointer to pointer) to the head of the list and a
	 * position, deletes the node at the given position
	 */
	private void removeNode(int position) {

		Node current = head;

		// If Link List is Empty
		if (head == null) {
			System.out.println("Nothing to Remove");
			return;
		}

		// If the head Node is to be removed
		if (position == 0) {
			head = current.next;
			return;
		}

		// Finding the previous Node of the Node to be deleted
		int i = 0;
		while (i < position - 1 && current != null) {
			current = current.next;
			i++;
		}

		// If position is more than Number of Nodes
		if (current == null || current.next == null)
			return;

		// Node current.next is the node to be deleted
		// Store pointer to the next of the node to be deleted

		Node next = current.next.next;
		current.next = next;

	}

	private void print() {

		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");

			current = current.next;
		}
		System.out.println();
	}
}
