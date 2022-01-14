import java.util.Arrays;

public class Subsequences {
    public static void main(String[] args) {
        String str = "xyz";
        String[] arr = subSequence(str);
        System.out.println(Arrays.toString(arr));
    }

    private static String[] subSequence(String str) {

        if (str.length() == 0) {
            String[] ans = { "" };
            return ans;
        }
        String[] smallAns = subSequence(str.substring(1));
        String[] ans = new String[2 * smallAns.length];

        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }

        for (int i = 0; i < smallAns.length; i++) {
            // ans[i + smallAns.length]
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }
}
