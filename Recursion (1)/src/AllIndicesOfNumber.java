public class AllIndicesOfNumber {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 8, 10, 8, 1, 6, 8, 5 };
        int[] iarr = allIndices(arr, 8, 0, 0);
        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }

        int[] iarr;

        if (arr[idx] == x) {
            iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
        } else {
            iarr = allIndices(arr, x, idx + 1, fsf);
        }

        return iarr;
    }

}
