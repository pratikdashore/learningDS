package ds.list.linkedList;

import ds.list.Node;

public interface LinkedList<T> {

	public void insertAtHead(T value);

	public void insertAtLast(T value);

	public void insertSorted(T value);

	public void removeFromHead();

	public void removeFromLast();

	public void removeNode(T value);

	public Node find(T value);

	public int length();
}
