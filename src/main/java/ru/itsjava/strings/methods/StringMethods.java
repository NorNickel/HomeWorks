package ru.itsjava.strings.methods;

public class StringMethods {

    public static boolean isPalindrome(String wordOrPhrase){
        wordOrPhrase = wordOrPhrase.replaceAll("[\\s\\p{P}&&[^u0027]]", "");
        wordOrPhrase = wordOrPhrase.toUpperCase();
        StringBuilder strBuilder = new StringBuilder(wordOrPhrase);
        return wordOrPhrase.equals(new String(strBuilder.reverse()));
    }

}
