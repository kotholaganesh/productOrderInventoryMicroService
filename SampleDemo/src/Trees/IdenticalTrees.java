package Trees;

class Node2 {
	Node2 left;
	Node2 right;
	int data;

	Node2(int data) {
		this.data = data;
	}
}

class Gfg {
	public static boolean isIdentical(Node2 r1, Node2 r2) {
		if (r1 == null && r2 == null) {
			return true;
		}
		if (r1 == null || r2 == null) {
			return false;
		}
		return (r1.data == r2.data && isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right));
	}
}

public class IdenticalTrees {
	public static void main(String[] args) {
		Node2 r1 = new Node2(1);
		r1.left = new Node2(2);
		r1.right = new Node2(3);
		r1.left.left = new Node2(4);

		Node2 r2 = new Node2(1);
		r2.left = new Node2(2);
		r2.right = new Node2(3);
		r2.left.left = new Node2(4);

		System.out.println(Gfg.isIdentical(r1, r2));
	}
}
