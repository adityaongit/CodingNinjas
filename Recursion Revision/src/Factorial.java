public class Factorial {
    public static void main(String[] args) {
        int res = factorial(4);
        System.out.println(res);
    }

    static int factorial(int n) {
        if (n == 1) {
            return n;                   //either of base case can be used or both of them 
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
