package LinkedList;

public class LinkedListInsertion {

	Node head;

	private class Node {

		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		LinkedListInsertion lli = new LinkedListInsertion();

		lli.insertAtStart(5);		// 5
		lli.insertAtEnd(6);			// 5 ->6
		lli.insertAtStart(10);		// 10->5->6
		lli.insertAtEnd(20);		// 10->5->6->20
		lli.insertAtStart(100);		// 100->10->5->6->20
		lli.insertAtEnd(50);		// 100->10->5->6->20->50

		lli.println();

	}




	private void insertAtStart(int x) {
		
		Node temp = new Node(x);
		
		temp.next=head;
		head=temp;
	}
	
	private void insertAtEnd(int x) {
		
		Node temp = new Node(x);
		
		if(head==null)
		{
			head=temp;
			return;
		}
		Node current = head;
		
		while(current.next!=null) 
			current=current.next;
		
		current.next=temp;
	}
	
	
	private void println() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
}
