public class Substrings {
    public static void main(String[] args) {
        printSubstrings("abc");
    }

    private static void printSubstrings(String string) {
        for (int start = 0; start < string.length(); start++) {
            for (int end = start; end < string.length(); end++) {
                System.out.println(string.substring(start, end + 1));
            }
        }
    }
}
