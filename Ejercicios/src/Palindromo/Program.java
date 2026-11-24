package Palindromo;

public class Program {
    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase().replace(" ", "");
        char[] strInv = new char[str.length()];
        int a = 0;
        int b = str.length() -1;
        while (a < str.length()) {
            strInv[a] = str.charAt(b);
            a++;
            b--;
        }
        String inv = new String(strInv);
        return str.equals(inv);
    }

    static void main(String[] args) {
        System.out.println(checkPalindrome("Anita Lava La TiNa"));
    }
}
