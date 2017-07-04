package ds.list.doublyLinkedList;

import ds.list.doublyLinkedList.Node;

public interface DoublyLinkedList<T> {
	public void insertAtHead(T value);

	public void insertAtLast(T value);

	public void insertAfter(T nodeAfter, T value);

	public void removeFromHead();

	public void removeFromLast();

	public void removeNode(T value);

	public Node<T> find(T value);

	public int length();

	public void removeNode(int position);

	public Node<T> get(int index);

	public T removeNodeAtIndex(int index);
}
