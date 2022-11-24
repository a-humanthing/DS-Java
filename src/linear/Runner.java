package linear;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		LinkedList ll = new LinkedList();
//		ll.insertFirst(4);
		 //double ll
		DLL dll = new DLL();
		int limit;
		System.out.println("Enter the limit");
		limit=sc.nextInt();
		for(int i=0;i<limit;i++) {
			System.out.println("Enter the data : ");
			int data=sc.nextInt();
			dll.insertFirst(data);
		}
		
		
		dll.show();
		System.out.println("Reversed list");
		dll.showReverse();
		
		
		
		
		//insertion
		
//		ll.insertFirst(10);
//		ll.insertFirst(142);
//		ll.insertFirst(12);
//		ll.insertLast(30);
//		ll.insertFirst(7);
//		ll.show();
//		
//		//System.out.println("Deleting element at index 2 which is "+ll.delete(0));
////		System.out.println("After delete");
////		ll.show();
//		System.out.println("Enter value to insert at fist :");
//		int value =sc.nextInt();
//		ll.insertFirst(value);
//		System.out.println("Enter value to insert at fist :");
//		int value2 =sc.nextInt();
//		ll.insertLast(value2);
//		System.out.println("Linked List after inserting at first and last:\n");
//		ll.show();
		
		
		
	}
}
