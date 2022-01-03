public class ReverseEachWord {
    public static void main(String[] args) {
        String res = reverseEachWord("abc def");
        System.out.println(res);
    }

    private static String reverseEachWord(String string) {
        string = string + " ";
        String revstring = "";
        int start = 0;
        for (int k = 0; k < string.length(); k++) {
            if (string.charAt(k) == ' ') {
                int end = k - 1;
                for (int i = end; i >= start; i--) {
                    revstring += string.charAt(i);
                }
                start = k + 1;

                revstring = revstring + " ";
            }
        }
        return revstring;
    }

}
