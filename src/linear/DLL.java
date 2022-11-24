package linear;

import linear.LinkedList.Node;

public class DLL {
	Node head;
	Node tail;
	int size;
	
	public class Node{
		int data;
		Node prev;
		Node next;
		public Node(int data) {
			this.data=data;
		}
		public Node(int data,Node next,Node prev) {
			this.data=data;
			this.prev=prev;
			this.next=next;
		}
	}
	public void insertFirst(int data) {
		Node node = new Node(data);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			
			head.prev=node;
		}
		head=node;
//		node.prev=head;
		if(tail==null)tail=head;
		size++;
		
	}
	public void show() {
		System.out.println("Entered List");
		Node temp=head;
		while(temp!=null) {
			System.out.print("  "+temp.data);
			temp=temp.next;
		}
		System.out.println("\nSize = "+size);
	}
	public void showReverse() {
		Node temp = tail;
		while(temp!=null) {
			System.out.print(" "+temp.data);
			temp=temp.prev;
		}
		System.out.println("\nSize = "+size);
	}
}
