public class RomanSum {

    public static void main(String args[]) {
        int arr[] = {12, 35, 1, 10, 36, 1};
        int largest = -1;
        int secondlargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);

    }
}
