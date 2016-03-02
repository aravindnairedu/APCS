package edu.kyleknobloch.APCS.Classwork.March;
public class Palindrome {
    public static boolean calcPalindrome(String orig) { orig=removePunctuation(orig); return (reverseString(orig).equalsIgnoreCase(orig)); }
    public static String reverseString(String orig) {
        String temp = "";
        for (int i = orig.length() -1; i >= 0; i--) { temp += orig.charAt(i); }
        return temp;
    }
    public static String removePunctuation(String orig) {
        String temp;
        temp = orig.replace(",", "");
        System.out.println(temp); //DEBUG
        return temp;
    }
}
