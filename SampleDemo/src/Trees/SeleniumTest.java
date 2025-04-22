package Trees;

class LinkedList {
	int value;
	LinkedList next;

	public LinkedList(int value) {
		this.value = value;
	}

}

public class SeleniumTest {

	public static LinkedList addTwolists(LinkedList l1, LinkedList l2) {

		int temp = 0;
		LinkedList ll = null;
		if (l1 == null & l2 == null) {
			return null;
		}

		LinkedList curr1 = l1;
		LinkedList curr2 = l2;
		while (curr1 != null && curr2 != null) {
			temp = curr1.value + curr2.value;
			System.out.print(temp);

			curr1 = curr1.next;
			curr2 = curr2.next;
		}

		return ll;
	}

	public static void nextValue(LinkedList ll) {
		LinkedList curr = ll;

		System.out.println(curr.value);
	}

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList(2);
		l1.next = new LinkedList(4);
		l1.next.next = new LinkedList(3);

		LinkedList l2 = new LinkedList(5);
		l2.next = new LinkedList(6);
		l2.next.next = new LinkedList(4);

		LinkedList lll = addTwolists(l1, l2);
		System.out.println();
		nextValue(l1.next);

	}
}
