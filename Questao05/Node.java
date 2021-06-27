package Questao05;


public class Node {

	public char value;

	public Node left;
	public Node right;

	public Node(char value) {
		this.value = value;
	}

	public boolean isLeaf() {
		return left == null && right == null;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public boolean hasRight() {
		return right != null;
	}

	public void setChilds(Node left, Node right) {
		this.left = left;
		this.right = right;
	}

	public String toString() {
		return String.format("%c", this.value);
	}
}
