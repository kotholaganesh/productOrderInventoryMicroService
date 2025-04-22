package Trees;

import java.util.LinkedList;
import java.util.Queue;

class NodeMir {
	int data;
	NodeMir left;
	NodeMir right;

	public NodeMir(int data) {
		this.data = data;
	}

	public static void mirror(NodeMir root) {
		if (root == null) {
			return;
		}
		mirror(root.left);
		mirror(root.right);

		NodeMir temp = root.left;
		root.left = root.right;
		root.right = temp;

	}

	public static void levelOrder(NodeMir root) {
		if (root == null) {
			return;
		}

		Queue<NodeMir> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			NodeMir curr = queue.poll();
			if (curr == null) {
				continue;
			}
			System.out.print(curr.data + "->");
			queue.add(curr.left);
			queue.add(curr.right);
		}
	}
}

public class MirrorTree {
	public static void main(String[] args) {
		NodeMir root = new NodeMir(1);
		root.left = new NodeMir(2);
		root.right = new NodeMir(3);
		root.left.left = new NodeMir(4);
		root.left.right = new NodeMir(5);
		NodeMir.mirror(root);
		NodeMir.levelOrder(root);
	}
}
