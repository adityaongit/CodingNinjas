public class CalculatePower {
    public static void main(String[] args) {
        int res = power(3, 5);
        System.out.println(res);
    }

    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        int ans = x * power(x, n - 1);
        return ans;
    }
}
