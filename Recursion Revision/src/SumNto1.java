public class SumNto1 {
    public static void main(String[] args) {
        int res = sum(5);
        System.out.println(res);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
