package ds.list.doublyEndedLinkedList;

import ds.list.Node;

public interface DELinkedList<T> {
    public void insertAtHead(T value);
    public void insertAtTail(T value);
    public void removeFromHead();
    public void removeFromTail();
    public int length();
    public Node<T> find(T value);
}
