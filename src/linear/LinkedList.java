package linear;

public class LinkedList {
	Node head;
	Node tail;
	int size;
	LinkedList(){
		this.size=0;
	}
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
		
	}
	public void insertFirst(int data) {
		Node node = new Node(data);
		node.next=head;
		head=node;
		if(tail==null)tail=head;
		size++;
		
	}
	public void show() {
		Node temp=head;
		while(temp!=null) {
			System.out.print("  "+temp.data);
			temp=temp.next;
		}
		System.out.println("\nSize = "+size);
	}
	
	public void insertLast(int data) {
		Node node = new Node(data);
		tail.next=node;
		node.next=null;
		tail=node;
		size++;
	}
	public int deleteFirst() {
		int data = head.data;
		head=head.next;
		size--;
		return data;
	}
	public int deleteLast() {
		if(size<=1) {
			size--;
			return deleteFirst();
		}
		Node secondlast = get(size-2);
		int data=tail.data;
		tail=secondlast;
		tail.next=null;
		size--;
		return data;
	}
	public int delete(int index) {
		if(index==0) {
			return deleteFirst();
		}
		if(index==size-1) {
			return deleteLast();
		}
		Node prev = get(index-1);
		int element = prev.next.data;
		prev.next = prev.next.next;
		size--;
		return element;
	}
	public Node get(int index) {
		Node temp =head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public int indexOfValue(int data) {
		Node temp=head;
		int index=0;
		while(temp.next!=null) {
			if(temp.data==data) {
				return index;
			}
			index++;
			temp=temp.next;
		}
		
		return -1;
	}
}
