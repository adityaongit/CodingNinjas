public class LastIndexOfNumber {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 8, 10, 8, 1 };
        int ans = lastIndex(arr, 1, arr.length - 1);
        System.out.println(ans);
    }

    private static int lastIndex(int[] arr, int element, int lastIndex) {
        if (lastIndex <= 0) {
            return -1;
        }
        if (arr[lastIndex] == element) {
            return lastIndex;
        }
        return lastIndex(arr, element, lastIndex - 1);
    }
}
