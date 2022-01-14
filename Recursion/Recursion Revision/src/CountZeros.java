public class CountZeros {
    public static void main(String[] args) {
        int res = count(50607);
        System.out.println(res);
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }
}
