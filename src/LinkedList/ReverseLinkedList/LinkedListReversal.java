package LinkedList.ReverseLinkedList;

public class LinkedListReversal {

	Node head;

	private class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	private Node reverseList(Node head2) {
		
		if(head.next==null)
			return head;
		
		Node nextNode = null;
		Node prev = null;
		
		while(head!=null)
		{
			nextNode=head.next;
			head.next=prev;
			prev=head;
			head=nextNode;
		}
		return prev;
	}
	
	public static void main(String... args) {

		LinkedListReversal llr = new LinkedListReversal();

		llr.insertAtBegin(10);
		llr.insertAtEnd(20);
		llr.insertAtBegin(60);
		llr.insertAtEnd(55);
		llr.insertAtBegin(22);
		llr.insertAtEnd(121);

		System.out.println("Linked List Before Reversal");
		llr.print();

		System.out.println("Linked List After Reversal");
		llr.head = llr.reverseList(llr.head);
		llr.print();
	}


	private void insertAtBegin(int data) {

		Node newElement = new Node(data);

		newElement.next = head;
		head = newElement;
	}

	private void insertAtEnd(int data) {

		Node newElement = new Node(data);

		if (head == null) {
			head = newElement;
			return;
		}

		Node current = head;

		while (current.next != null)
			current = current.next;

		current.next = newElement;

	}

	private void print() {
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " ");

			current = current.next;
		}

	}
}
