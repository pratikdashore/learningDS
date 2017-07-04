package ds.list.doublyEndedLinkedList;

public class DELinkedListDemo {
	public static void main(String[] args) {
		DELinkedList<Integer> deList = new DELinkedListImpl<Integer>();
		deList.insertAtHead(10);
		deList.insertAtHead(20);
		deList.insertAtTail(30);
		deList.insertAtTail(40);
		
		System.out.println(deList);
		deList.removeFromHead();
		deList.removeFromTail();
		System.out.println(deList);
		
		
		deList.removeFromHead();
		deList.removeFromTail();
		System.out.println(deList);
		
		deList.insertAtTail(40);
		System.out.println(deList);
		deList.removeFromHead();
		deList.removeFromTail();
		System.out.println(deList);

	}
}
