package Arrays_Strings;

public class Stream {
    public static void main(String[] args) {
        String res = skip("abcxdxbx", 'x');
        System.out.println(res);
    }

    static String skip(String s, char c) {
        String ans = "";
        if (s.length() == 0) {
            return ans;
        }
        if (s.charAt(0) != c) {
            ans = ans + s.charAt(0);
        }
        return ans + skip(s.substring(1), c);
    }

    static String skipApple(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("apple")) {
            return skipApple(s.substring(5));
        } else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
}
