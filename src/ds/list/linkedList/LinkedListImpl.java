package ds.list.linkedList;

import ds.list.Node;

public class LinkedListImpl<T> implements LinkedList<T> {
	private Node<T> head;

	@Override
	public void insertAtHead(T value) {
		Node<T> newNode = new Node<>(value);
		newNode.setNext(this.head);
		this.head = newNode;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Node<T> current = this.head;
		while (current != null) {
			sb.append("| ").append(current).append(" |").append("-----> ");
			current = current.getNext();
		}
		
		return sb.toString();
	}

	@Override
	public int length() {
		int size = 0;
		Node<T> current = this.head;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	@Override
	public void removeFromHead() {
		if (head != null) {
			head = head.getNext();
		}
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
	public void insertAtLast(T value) {
		Node<T> newNode = new Node<>(value);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node<T> currentNode = this.head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
	}

	@Override
	public void removeFromLast() {
		if (this.head != null) {
			Node<T> currentNode = this.head;
			if (currentNode.getNext() == null) {
				this.head = null;
			} else {
				while (currentNode.getNext().getNext() != null) {
					currentNode = currentNode.getNext();
				}
				currentNode.setNext(null);
			}
		}
	}

	@Override
	public void insertSorted(T value) {

	}

	@Override
	public void removeNode(T value) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node<T> currentNode = head;
		if (currentNode.getValue().equals(value)) {
			this.head = currentNode.getNext();
			currentNode = null;
		} else {
			while (currentNode.getNext() != null) {
				if (currentNode.getNext().getValue().equals(value)) {
					currentNode.setNext(currentNode.getNext().getNext());
					return;
				}
				currentNode = currentNode.getNext();
			}
		}
	}

}
