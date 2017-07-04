package ds.list.doublyLinkedList;

public class DoublyLinkedListImpl<T> implements DoublyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	@Override
	public void insertAtHead(T value) {
		Node<T> newNode = new Node<>(value);
		if (this.head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNextNode(head);
			this.head.setPreNode(newNode);
			this.head = newNode;
		}
		size++;
	}

	@Override
	public void insertAtLast(T value) {
		final Node<T> last = tail;
		Node<T> newNode = new Node<>(last, value, null);
		tail = newNode;
		if(last == null){
			head = newNode;
		}else{
			last.setNextNode(newNode);
		}
	    size++;
	}

	@Override
	public void insertAfter(T nodeAfter, T value) {
		

	}

	@Override
	public void removeFromHead() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFromLast() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeNode(T value) {

	}

	private boolean isElementIndex(int index) {
		return (index > -1 && index < size);
	}

	@Override
	public Node<T> get(int index) {
		if (isElementIndex(index)) {
			return nodeAtIndex(index);
		}
		return null;
	}

	private Node<T> nodeAtIndex(int index) {
		if (index > (size >> 1)) {
			Node<T> currentNode = tail;
			for (int i = size - 1; i > index; i--) {
				currentNode = currentNode.getPreNode();
			}
			return currentNode;
		} else {
			Node<T> curreNode = head;
			for (int i = 0; i < index; i++) {
				curreNode = curreNode.getNextNode();
			}
			return curreNode;
		}
	}

	private T unlink(Node<T> node) {
		final T val = node.getValue();
		final Node<T> pre = node.getPreNode();
		final Node<T> post = node.getNextNode();

		if (pre == null) {
			head = post;
		} else {
			pre.setNextNode(post);
			node.setPreNode(null);
		}

		if (post == null) {
			tail = pre;
		} else {
			post.setPreNode(pre);
			node.setPreNode(null);
		}
		node.setValue(null);
		size--;
		return val;
	}
	
	@Override
	public T removeNodeAtIndex(int index){
		if(isElementIndex(index)){
			return unlink(nodeAtIndex(index));
		}
		return null;
	}

	@Override
	public void removeNode(int idx) {
		if (isElementIndex(idx)) {
			int position = idx + 1;
			if (size == 1) {
				head = null;
				tail = null;
				return;
			} else if (position > (size >> 1)) {
				Node<T> currentNode = tail;
				int last = size;
				if (size == position) {
					tail = tail.getPreNode();
					tail.setNextNode(null);
				} else {
					while (last > position) {
						currentNode = currentNode.getPreNode();
						last--;
					}
					Node<T> nodeToRemove = currentNode;

					currentNode.getPreNode().setNextNode(
							nodeToRemove.getNextNode());
					currentNode.getNextNode().setPreNode(
							nodeToRemove.getPreNode());
				}
			} else {
				Node<T> currentNode = head;
				int first = 1;

				if (first == position) {
					head = head.getNextNode();
					head.setPreNode(null);
					size--;
				} else {
					while (first < position) {
						currentNode = currentNode.getNextNode();
						first++;
					}
					Node<T> nodeToRemove = currentNode;

					currentNode.getPreNode().setNextNode(
							nodeToRemove.getNextNode());
					currentNode.getNextNode().setPreNode(
							nodeToRemove.getPreNode());
				}

			}
			size--;
		}
	}

	@Override
	public Node<T> find(T value) {
		Node<T> current = this.head;
		while (current != null) {
			if (current.getValue().equals(value)) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}

	@Override
	public int length() {
		return this.size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> currentNode = head;
		while (currentNode != null) {
			sb.append("| ").append(currentNode).append(" |").append("-----> ");
			currentNode = currentNode.getNextNode();
		}
		return sb.toString();
	}

}
