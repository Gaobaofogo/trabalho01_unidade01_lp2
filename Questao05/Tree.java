package Questao05;

import java.util.LinkedList;

public class Tree {

	public Node root;

	public Tree(String matricula) {
		root = new Node(matricula.charAt(5));
		Node node0 = new Node(matricula.charAt(0));
		Node node1 = new Node(matricula.charAt(1));
		Node node2 = new Node(matricula.charAt(2));
		Node node3 = new Node(matricula.charAt(3));
		Node node4 = new Node(matricula.charAt(4));
		Node node6 = new Node(matricula.charAt(6));
		Node node7 = new Node(matricula.charAt(7));
		Node node8 = new Node(matricula.charAt(8));
		Node node9 = new Node(matricula.charAt(9));
		Node node10 = new Node(matricula.charAt(10));

		root.setChilds(node3, node9);
		node3.setChilds(node1, node4);
		node1.setChilds(node0, node2);

		node9.setChilds(node7, node10);
		node7.setChilds(node6, node8);
    	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node root) {
		if (root != null) {
			System.out.print(root);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.toString());
			inOrder(root.right);
		}
	}

	public void posOrder() {
		posOrder(root);
	}

	private void posOrder(Node root) {
		if (root != null) {
			posOrder(root.left);
			posOrder(root.right);
			System.out.print(root);
		}
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		while (!queue.isEmpty()) {
			Node current = queue.removeFirst();
			if (current != null) {
				System.out.println(root);
				queue.addLast(current.left);
				queue.addLast(current.right);
			}
		}
	}
}
