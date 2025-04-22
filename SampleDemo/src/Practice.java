import java.util.Arrays;

public class Practice {


    public static void main(String args[]) {
        int arr[] = {-1, 5, 3, 2, 4, 8, 17, 6};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;

        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;

        }
    }

    public static class TwoArrAdd {
        public static void main(String[] args) {
            int arr1[] = {2, 4, 3};
            int arr2[] = {5, 6, 4};

            int len1 = arr1.length;
            int len2 = arr2.length;
            int sum1 = 0;
            for (int i = arr1.length - 1; i >= 0; i--) {
                int val = arr1[i];
                int tmp = i;
                while (tmp > 0) {
                    val = val * 10;
                    tmp--;
                }
                sum1 = sum1 + val;

            }
            int sum2 = 0;
            for (int i = arr2.length - 1; i >= 0; i--) {
                int val = arr2[i];
                int tmp = i;
                while (tmp > 0) {
                    val = val * 10;
                    tmp--;
                }
                sum2 = sum2 + val;

            }
            System.out.println(sum1 + sum2);
        }
    }
}

