public class ReverseString {
    public static void main(String[] args) {
        String s1 = reverseString1("Hello");
        String s2 = reverseString2("Hello Boy");
        String s3 = reverseString3("Hello");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    private static String reverseString1(String str) {
        String revstring = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revstring += str.charAt(i);
        }
        return revstring;
    }

    private static String reverseString2(String str) {
        String revstring = "";
        for (int i = 0; i < str.length(); i++) {
            revstring += str.charAt(str.length() - i - 1);
        }
        return revstring;
    }

    private static String reverseString3(String str) {
        String revstring = "";
        for (int i = 0; i < str.length(); i++) {
            revstring = str.charAt(i) + revstring;
        }
        return revstring;
    }

}
