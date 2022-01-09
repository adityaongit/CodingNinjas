package Problems;
// Coding Ninjas Approach to Merge Sort

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 3, 6, 9, 8 };
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;

        int[] part1 = new int[mid];
        int[] part2 = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            part1[i] = arr[i];
        }
        int k = 0;
        for (int i = mid; i < arr.length; i++) {
            part2[k] = arr[i];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(part1, part2, arr);
    }

    private static void merge(int[] part1, int[] part2, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < part1.length && j < part2.length) {
            if (part1[i] < part2[j]) {
                arr[k] = part1[i];
                i++;
            } else {
                arr[k] = part2[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < part1.length) {
            arr[k] = part1[i];
            i++;
            k++;
        }

        while (j < part2.length) {
            arr[k] = part2[j];
            j++;
            k++;
        }
    }
}
