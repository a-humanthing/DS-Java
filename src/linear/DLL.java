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
	public void insertAround(int data1,int data2, int index) {
		Node node1 = new Node(data1);
		Node node2 = new Node(data2);
		Node middle = get(index);
		middle.prev.next=node1;
		node1.prev=middle.prev;
		node1.next=middle;
		middle.prev=node1;
		node2.next=middle.next;
		node2.prev=middle;
		middle.next=node2;
		size+=2;
	}
	public Node get(int index) {
		Node temp =head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp;
	}
}
