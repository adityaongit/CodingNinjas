public class OperationOnDigits {
    public static void main(String[] args) {
        reverse(1342);
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

    static void reverse(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }
}
