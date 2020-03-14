package ru.spb.aog.strings.methods;

public class StringMethods {

    public static boolean isPalindrome(String wordOrPhrase){
        wordOrPhrase = wordOrPhrase.replaceAll("[\\s\\p{P}&&[^u0027]]", "");
        String reverseWordOrPhrase = new StringBuilder(wordOrPhrase).reverse().toString();
        return wordOrPhrase.equalsIgnoreCase(reverseWordOrPhrase);
    }

}
