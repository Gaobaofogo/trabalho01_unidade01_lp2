package Questao06;

import java.util.LinkedList;


public class Tree {

	public Node root;

    @Override
    public String toString() {
        return this.toString(root, 1);
    }

    private String toString(Node node, int level) {
        if (node != null) {
            String right = this.toString(node.right, level + 1);
            String node_str = String.format(
                "%s%s [Level:%d]\n",
                this.tabFormatter(level - 1),
                node.toString(),
                level);
            String left = this.toString(node.left, level + 1);

            return right + node_str + left;
        }

        return "";
    }

    private String tabFormatter(int level) {
        if (level <= 0) {
            return "";
        }

        return "\t" + this.tabFormatter(level - 1);
    }

    @Override
    public boolean equals(Object t) {
        if (t == this) {
            return true;
        }

        if (!(t instanceof Tree)) {
            return false;
        }

        Tree otherTree = (Tree) t;

        return this.equals(this.root, otherTree.root);
    }

    private boolean equals(Node n1, Node n2) {
        if ((n1 != null && n2 == null) ||
                (n1 == null && n2 != null)) {
            return false;
        }

        if (n1 == null && n2 == null) {
            return true;
        }

        boolean left = this.equals(n1.left, n2.left);
        boolean value = n1.value == n2.value;
        boolean right = this.equals(n1.right, n2.right);

        return left && value && right;
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
