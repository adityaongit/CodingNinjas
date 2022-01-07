public class FirstIndexOfNumber {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 8, 10, 8 };
        int ans = firstIndex(arr, 8, 0);
        System.out.println(ans);
    }

    private static int firstIndex(int[] arr, int element, int startIndex) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr[startIndex] == element) {
            return startIndex;
        }
        return firstIndex(arr, element, startIndex + 1);
    }
}

