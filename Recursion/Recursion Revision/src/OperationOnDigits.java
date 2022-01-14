public class OperationOnDigits {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1342));
    }

    static int sumOfDigits(int n) {
        if (n / 10 == 0) {
            return 1;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    static int productOfDigits(int n) {
        if (n / 10 == 0) {
            return 1;
        }
        return (n % 10) * productOfDigits(n / 10);
    }

    static void reverseVoid(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }

    static int reverse(int num) {
        int ans = 0;
        if (num == 0) {
            return ans;
        }
        if (num > 0) {
            int temp = num % 10;
            ans = ans * 10 + temp;
            reverse(num / 10);
        }
        return ans;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

}
