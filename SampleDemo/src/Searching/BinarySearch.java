package Searching;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7 };
		int target = 6;
		int low = 0;
		int high = arr.length - 1;
		int result = binarySearch(arr, target, low, high);
		System.out.println(result);
	}

	static int binarySearch(int arr[], int target, int low, int high) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				low = mid - 1;
			}
		}
		return -1;
	}
}
