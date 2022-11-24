package linear;

public class Runner {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertFirst(4);
		ll.insertFirst(10);
		ll.insertFirst(142);
		ll.insertFirst(12);
		ll.insertLast(30);
		ll.insertFirst(7);
		ll.show();
		System.out.println("Deleting element at index 2 which is "+ll.delete(0));
		System.out.println("After delete");
		ll.show();
		
	}
}
