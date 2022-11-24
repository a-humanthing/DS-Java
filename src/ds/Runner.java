package ds;

public class Runner {
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.insert(5);
		linkedlist.insert(6);
		linkedlist.insert(89);
		linkedlist.insert(2);
		linkedlist.show();
		linkedlist.deleteAt(2);
		System.out.println("AFter deletion");
		linkedlist.show();
	}
}
