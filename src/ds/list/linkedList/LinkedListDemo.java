package ds.list.linkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedListImpl<Integer>();
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		list.insertAtHead(40);

		list.insertAtLast(800);
		list.insertAtLast(900);
		list.insertAtLast(950);
		list.insertAtLast(1000);

		System.out.println(list);
		System.out.println(list.length());

		list.removeNode(800);
		list.removeNode(40);
		list.removeNode(1000);

		System.out.println(list);
		System.out.println(list.length());

	}
}
