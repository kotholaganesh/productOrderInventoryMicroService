public class TwoSum {
    public static void main(String args[]) {
        int arr[] = {2, 7, 11, 15};
        int target = 22;

        for (int i = 0; i < arr.length - 1; i++) {
            int comp = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == comp) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}




