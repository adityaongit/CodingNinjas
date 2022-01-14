public class SumOfDigits {
    public static void main(String[] args) {
        int res = sumOfDigits(1342);
        System.out.println(res);
    }
    static int sumOfDigits(int n){
        if(n/10 == 0){
            return 1;
        }
        return (n%10)+sumOfDigits(n/10);
    }
}
