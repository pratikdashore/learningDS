package ds.list.doublyLinkedList;

class Node<T> {
	private Node<T> preNode;
	private Node<T> nextNode;
	private T value;
	
	public Node(Node<T> pre, T value, Node<T> next){
		this.preNode = pre;
		this.nextNode = next;
		this.value = value;
	}

	public Node(T value) {
		this.value = value;
	}

	public Node<T> getPreNode() {
		return preNode;
	}

	public void setPreNode(Node<T> preNode) {
		this.preNode = preNode;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value + "";
	}
}
