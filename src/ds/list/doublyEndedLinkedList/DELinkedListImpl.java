package ds.list.doublyEndedLinkedList;

import ds.list.Node;

public class DELinkedListImpl<T> implements DELinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	@Override
	public void insertAtHead(T value) {
		Node<T> newNode = new Node<T>(value);
		newNode.setNext(this.head);
		this.head = newNode;
		if (this.size == 0) {
			tail = newNode;
		}
		size++;
	}

	@Override
	public void insertAtTail(T value) {
		Node<T> newNode = new Node<T>(value);
		if (this.size == 0) {
			this.head = newNode;
		} else {
			this.tail.setNext(newNode);
		}
		this.tail = newNode;
		this.size++;
	}

	@Override
	public void removeFromHead() {
		if (this.size > 0) {
			if (this.size > 1) {
				this.head = this.head.getNext();
			}
			if (this.size == 1) {
				this.head = this.head.getNext();
				this.tail = this.head;
			}
			this.size--;
		}
	}

	@Override
	public void removeFromTail() {
		if (this.size > 0) {
			if (this.size == 1) {
				this.head = null;
				this.tail = null;
			}
			if (this.size > 1) {
				Node<T> current = this.head;
				while (current.getNext() != tail) {
					current = current.getNext();
				}
				current.setNext(null);
				this.tail = current;
			}
			size--;
		}
	}

	@Override
	public int length() {
		return this.size;
	}

	@Override
	public Node<T> find(T value) {
		Node<T> node = null;
		Node<T> current = this.head;
		while (current != null) {
			if (current.getValue().equals(value)) {
				return current;
			}
			current = current.getNext();
		}
		return node;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		Node<T> current = this.head;
		while (current != null) {
			sb.append(current.toString());
			sb.append(", ");
			current = current.getNext();
		}
		sb.append(" }");
		return sb.toString();
	}
}
