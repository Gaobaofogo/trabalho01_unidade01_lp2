package Questao07;

public class Questao07 {
	public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(args[0].charAt(5));

        tree.root = root;

		Node node0 = new Node(args[0].charAt(0));
		Node node1 = new Node(args[0].charAt(1));
		Node node2 = new Node(args[0].charAt(2));
		Node node3 = new Node(args[0].charAt(3));
		Node node4 = new Node(args[0].charAt(4));
		Node node6 = new Node(args[0].charAt(6));
		Node node7 = new Node(args[0].charAt(7));
		Node node8 = new Node(args[0].charAt(8));
		Node node9 = new Node(args[0].charAt(9));
		Node node10 = new Node(args[0].charAt(10));

		root.setChilds(node3, node9);
		node3.setChilds(node1, node4);
		node1.setChilds(node0, node2);

		node9.setChilds(node7, node10);
		node7.setChilds(node6, node8);

        Tree tree_2 = new Tree();
        Node root_2 = new Node(args[0].charAt(5));
        tree_2.root = root_2;

		Node node_0 = new Node(args[0].charAt(0));
		Node node_1 = new Node(args[0].charAt(1));
		Node node_2 = new Node(args[0].charAt(2));
		Node node_3 = new Node(args[0].charAt(3));
		Node node_4 = new Node(args[0].charAt(4));
		Node node_6 = new Node(args[0].charAt(6));
		Node node_7 = new Node(args[0].charAt(7));
		Node node_8 = new Node(args[0].charAt(8));
		Node node_9 = new Node(args[0].charAt(9));
		Node node_10 = new Node(args[0].charAt(10));

		root_2.setChilds(node_3, node_9);
		node_3.setChilds(node_1, node_4);
		node_1.setChilds(node_0, node_2);

		node_9.setChilds(node_7, node_10);
		node_7.setChilds(node_6, node_8);

        System.out.println(tree.equals(tree_2));
    }
}
