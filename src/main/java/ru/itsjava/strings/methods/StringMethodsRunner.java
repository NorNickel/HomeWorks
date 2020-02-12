package ru.itsjava.strings.methods;

public class StringMethodsRunner {
    public static void main(String[] args) {
        // StringMethodsExamples.printSomeMethods();

        System.out.println("StringMethods.isPalindrome(\"Я иду с мечем судия\") = "
                + StringMethods.isPalindrome("Я иду с мечем судия"));

        System.out.println("StringMethods.isPalindrome(\"Кабак\") = "
                + StringMethods.isPalindrome("Кабак!!"));

        System.out.println("StringMethods.isPalindrome(\"Каток!?\") = "
                + StringMethods.isPalindrome("Каток!?"));
    }

}
