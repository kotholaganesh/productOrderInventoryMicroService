package Searching;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 1, 7, 2, 8, 4 };
		int x = 7;

		int result = linearSearch(arr, x);
		System.out.println(result);
	}

	static int linearSearch(int arr[], int target) {
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				tmp = i;
				break;
			}
		}
		return tmp;
	}

}
