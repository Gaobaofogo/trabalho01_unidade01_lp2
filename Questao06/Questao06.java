package Questao06;

public class Questao06 {
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

        System.out.println(tree.toString());
    }
}
