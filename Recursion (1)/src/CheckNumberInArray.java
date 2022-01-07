public class CheckNumberInArray {
    public static void main(String[] args) {
        int[] arr = { 7, 9, 8, 10 };
        boolean ans = checkNumber(arr, 0, 6);
        System.out.println(ans);
    }

    private static boolean checkNumber(int[] arr, int startIndex, int i) {
        if (arr.length <= 0 || startIndex == arr.length) {
            return false;
        }
        if (i == arr[startIndex]) {
            return true;
        }
        return checkNumber(arr, startIndex + 1, i);
    }

}
