public class CountWords {
    public static void main(String[] args) {
        int words = countWords("Coding Ninjas String Course");
        System.out.println(words);
    }

    public static int countWords(String str) {
        if(str.length() == 0){
            return 0;
        }
        int spaces = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==' '){
                spaces++;
            }
        }
        return spaces;
    }
}

