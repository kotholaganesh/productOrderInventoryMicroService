package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph {
	private final Map<Integer, List<Integer>> mp;

	public Graph() {
		this.mp = new HashMap<>();
	}

	public void addVertex(int data) {
		mp.putIfAbsent(data, new ArrayList<>());
	}
}

public class TreeTraversals {

	public static void main(String[] args) {
		Graph gp = new Graph();

		for (int i = 1; i <= 5; i++) {
			gp.addVertex(i);
		}
	}

}
