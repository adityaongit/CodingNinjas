package Problems;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String res = removeDuplicates("xxxyyyzwwzzz");
        System.out.println(res);
    }

    private static String removeDuplicates(String string) {
        if (string.length() <= 1) {
            return string;
        }
        if (string.charAt(0) == string.charAt(1)) {
            return removeDuplicates(string.substring(1));
        } else {
            return string.charAt(0) + removeDuplicates(string.substring(1));
        }
    }
}
