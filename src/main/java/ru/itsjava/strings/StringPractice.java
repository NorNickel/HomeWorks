package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
        String str1 = "Я замечательная строка";
        String str2 = "Я замечательная строка";
        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        System.out.println("str1 == str2 = " + (str1 == str2));

        String str3 = new String ("Я замечательная строка");

        System.out.println("str1 == str3 = " + (str1 == str3));

        str3 = str3.intern();
        System.out.println("str1 == str3 after intern() = " + (str1 == str3));

        /*String bad = "Bad";
        for (int i = 0; i < 10000; i++){
            bad = bad + i;
        }
        System.out.println(bad);*/

        StringBuilder goodBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++){
            goodBuilder = goodBuilder.append(i);
        }
        System.out.println(goodBuilder);

        StringBuffer stringBuffer = new StringBuffer();

    }
}
