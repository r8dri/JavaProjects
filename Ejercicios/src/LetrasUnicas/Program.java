package LetrasUnicas;

public class Program {
    public static char[] findLetters(String word) {
        String newWord = "";
        int a = 0;
        while(a < word.length()) {
            int aparece = 0;
            for (int i = 0; i < word.length(); i++) {
                if (String.valueOf(word.charAt(a)).equalsIgnoreCase(String.valueOf(word.charAt(i)))) {
                    aparece++;
                }
            }
            if (aparece == 1) {
                newWord = newWord + word.charAt(a);
            }
            a++;
        }
        return newWord.toCharArray();
    }

    static void main(String[] args) {
        System.out.println(findLetters("monopoly"));
    }
}
