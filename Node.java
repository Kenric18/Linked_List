public class Node {

	private int nodeValue;
	private Node pointer;

	public Node() {
		pointer = null;
	}

	public Node(int nodeValue, Node pointer) {
		this.nodeValue = nodeValue;
		this.pointer = pointer;
	}

	public int getValue() {
		return nodeValue;
	}

	public void setValue(int value) {
		nodeValue = value;
	}

	public Node getPointer() {
		return pointer;
	}

	public void setPointer(Node pointer) {
		this.pointer = pointer;
	}


}