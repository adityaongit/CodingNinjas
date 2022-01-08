package Problems;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String res = replaceChar("abacd", 'a', 'x');
        String res2 = replaceChar2("abacad", 'a', 'x');
        System.out.println(res);
        System.out.println(res2);
    }

    private static String replaceChar(String string, char c, char d) {
        if (string.isEmpty()) {
            return string;
        }
        String ans = "";
        if (string.charAt(0) == c) {
            ans = ans + d;
        } else {
            ans = ans + string.charAt(0);
        }
        String smallAns = replaceChar(string.substring(1), c, d);
        return ans + smallAns;
    }

    private static String replaceChar2(String string, char c, char d) {
        if (string.isEmpty()) {
            return string;
        }
        char i;
        if (string.charAt(0) == c) {
            i = d;
        } else {
            i = string.charAt(0);
        }
        String smallAns = replaceChar(string.substring(1), c, d);
        return i + smallAns;
    }
}
