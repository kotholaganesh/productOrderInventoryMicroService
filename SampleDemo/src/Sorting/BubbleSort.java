package Sorting;

import java.util.Stack;

public class BubbleSort {
	public static void main(String[] args) {
		String name = "Ganesh";
		StringBuilder s = new StringBuilder();

		Stack<Character> st = new Stack<>();

		for (char c : name.toCharArray()) {
			st.push(c);
			while(!st.isEmpty()) {
			s.append(st.pop());
			}
		}

		System.out.println(s.toString());

	}
}
