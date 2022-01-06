public class PrintNumbers {
    public static void main(String[] args) {
        getNumber(6);
    }

    private static void getNumber(int i) {
        if(i==0){
            return;
        }
        getNumber(i-1);
        System.out.print(i+" ");
    }
}
