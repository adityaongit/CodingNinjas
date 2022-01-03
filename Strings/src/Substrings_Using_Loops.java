public class Substrings_Using_Loops {
    public static void main(String[] args) {
        printAllSubstring("abc");
    }

    private static void printAllSubstring(String string) {
        int n = string.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(string.charAt(k));
                }
                System.out.println();
            }
        }

    }
}
