class Node {
	String data;
	Node left;
	Node right;

	Node(String data) {
		this.data = data;
	}
}

class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	public void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + "->");
		inorder(root.right);
	}

	public void preorder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + "->");
		preorder(root.left);
		preorder(root.right);
	}

	public void postorder(Node root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + "->");
	}

	public int height(Node root) {
		if (root == null) {
			return -1;
		}

		int lh = height(root.left);
		int rh = height(root.right);

		return Math.max(lh, rh) + 1;

	}

}

class InterviewPrep2 {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node("A");
		tree.root.left = new Node("B");
		tree.root.right = new Node("C");
		tree.root.left.left = new Node("D");
		tree.root.left.right = new Node("E");
		tree.root.left.right.left = new Node("F");

		System.out.println("Inroder traversal left root right");
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Pre traversal root left right");
		tree.preorder(tree.root);
		System.out.println();
		System.out.println("Post traversal left right root");
		tree.postorder(tree.root);
		System.out.println();
		System.out.println("height of tree " + tree.height(tree.root));

	}
}
