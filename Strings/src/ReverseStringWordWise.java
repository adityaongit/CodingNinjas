public class ReverseStringWordWise {
    public static void main(String[] args) {
        String res = reverseStringWordWise("Welcome to Coding Ninjas");
        System.out.println(res);
    }

    private static String reverseStringWordWise(String string) {
        String output = "";
        int i = string.length() - 1;
        int end = string.length();
        while(i >= 0){
            if (string.charAt(i) == ' ') {
                output += string.substring(i + 1, end) + " ";
                end = i;
            }
            i--;
        }
        output += string.substring(i + 1, end);
        return output;
    }
}
