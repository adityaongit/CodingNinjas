public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("abcdcba"));
        System.out.println(checkPalindrome("abcdba"));
    }

    private static boolean checkPalindrome(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
