public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 9, 10, -8 };
        int ans = sum(arr, arr.length);
        System.out.println(ans);
    }

    private static int sum(int[] arr, int length) {
        if (length <= 0) {
            return 0;
        }
        return sum(arr, length - 1) + arr[length - 1];
    }

}
