package Problems;

public class RemoveX {
    public static void main(String[] args) {
        // String res = removeX("abcxdxbx");
        String res = removeX("xxxx");
        System.out.println(res);
    }

    private static String removeX(String string) {
        if (string.isEmpty()) {
            return string;
        }
        String ans = "";
        if (string.charAt(0) != 'x') {
            ans = ans + string.charAt(0);
        }
        String smallAns = removeX(string.substring(1));
        return ans + smallAns;
    }

}
