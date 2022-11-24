package linear;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		ll.insertFirst(4);
		ll.insertFirst(10);
		ll.insertFirst(142);
		ll.insertFirst(12);
		ll.insertLast(30);
		ll.insertFirst(7);
		ll.show();
		//System.out.println("Deleting element at index 2 which is "+ll.delete(0));
//		System.out.println("After delete");
//		ll.show();
		System.out.println("Enter value to delete:");
		int target =sc.nextInt();
		boolean success;
		
		int index=ll.indexOfValue(target);
		if(index==-1) {
			success=false;
			System.out.println("DELETE STATUS:item not found");
		}
		else {
			ll.delete(index);
			success=true;
			System.out.println("DELETE STATUS:success");
		}
		if(success) {
		System.out.println("Current Array");
		ll.show();
			System.out.println("index of deleted element " +target+" = "+index);
		}
		
	}
}
