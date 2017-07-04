package ds.list.doublyLinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList<Long> dlist = new DoublyLinkedListImpl<Long>();
		List<Long> list = new LinkedList<Long>();

		for (int i = 0; i < 10000000; i++) {
			dlist.insertAtHead(i * Math.round(Math.random() * 20));
			list.add(i * Math.round(Math.random() * 20));
		}
		
		int idx = 10;
		System.out.println(idx>>1);
		System.out.println(idx);
		long startTimeO = System.nanoTime();

		long a = list.remove(idx);
		long endTimeO = System.nanoTime();
		long durationO = (endTimeO - startTimeO);
		System.out.println(durationO + "-->" + a);

		long startTime = System.nanoTime();

		  dlist.removeNode(idx);
		 
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println(duration + "-->" );
		String msg = durationO - duration > 0 ? "mine won" : "Improve" ;
		System.out.println(msg);
	}

}
