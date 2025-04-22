package DesignPatterns.Creational;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}

class BinaryTree {
	Node root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	public Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}

		return root;
	}

	public void traverse() {
		traverseRec(root);
	}

	public void traverseRec(Node root) {
		if (root != null) {
			traverseRec(root.left);
			System.out.print(root.data + " ");
			traverseRec(root.right);
		}

	}
}

public class InterviewPrep {
	public static void main(String[] args) {
		final BinaryTree tree = new BinaryTree();
		tree.insert(8);
		tree.insert(7);
		tree.insert(12);
		tree.insert(15);
		tree.insert(2);
		tree.insert(5);

		tree.traverse();
	}
}
