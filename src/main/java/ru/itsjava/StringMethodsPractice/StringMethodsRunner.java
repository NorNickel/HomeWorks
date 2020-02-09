package ru.itsjava.StringMethodsPractice;

public class StringMethodsRunner {
    public static void main(String[] args) {
        String testString = "Hello, World, World!";

        System.out.println("testString = " + testString + "\n");

        System.out.println("testString.length() = " + testString.length());

        System.out.println("testString.equals(\"Hello, World, World)\") = "
                + testString.equals("Hello, World, World)"));
        System.out.println("testString.hashCode() = " + testString.hashCode());
        System.out.println("testString.hashCode() = " + "Hello, World, World)".hashCode());

        System.out.println("testString.equals(\"Hello, World, World!\") = "
                + testString.equals("Hello, World, World!"));
        System.out.println("testString.hashCode() = " + testString.hashCode());
        System.out.println("testString.hashCode() = " + "Hello, World!".hashCode());

        System.out.println("testString.compareTo(\"Hello, Saint-Petersburg\") = "
                + testString.compareTo("Hello, Saint-Petersburg"));
        System.out.println("testString.compareTo(\"Hello, World\") = "
                + testString.compareTo("Hello, World"));
        System.out.println("testString.compareTo(\"Hello, Zambia\") = "
                + testString.compareTo("Hello, Zambia"));

        System.out.println("testString.compareToIgnoreCase(\"HELLO, WORLD!\") = "
                + testString.compareToIgnoreCase("HELLO, WORLD!"));

        System.out.println("testString.codePointAt(0) = " + testString.codePointAt(0));
        System.out.println("testString.codePointAt(5) = " + testString.codePointAt(5));
        System.out.println("testString.codePointAt(10) = " + testString.codePointAt(10));

        System.out.println("testString.codePointBefore(1) = " + testString.codePointBefore(1));
        System.out.println("testString.codePointBefore(6) = " + testString.codePointBefore(6));
        System.out.println("testString.codePointBefore(11) = " + testString.codePointBefore(11));

        System.out.println("testString.codePointCount(0, 11) = " + testString.codePointCount(0, 11));

        System.out.println("testString.codePoints() = " + testString.codePoints()); // stream

        System.out.println("testString.concat(\" Hmm...\") = " + testString.concat(" Hmm..."));

        System.out.println("testString.charAt(0) = " + testString.charAt(0));
        System.out.println("testString.charAt(5) = " + testString.charAt(5));
        System.out.println("testString.charAt(10) = " + testString.charAt(10));

        System.out.println("testString.chars() = " + testString.chars()); // stream

        System.out.println("testString.contains(\"o\") = " + testString.contains("o"));
        System.out.println("testString.contains(\"World\") = " + testString.contains("World"));
        System.out.println("testString.contains(\"z\") = " + testString.contains("z"));

        System.out.println("testString.endsWith(\"World!\") = " + testString.endsWith("World!"));
        System.out.println("testString.endsWith(\")))\") = " + testString.endsWith(")))"));

        System.out.println("testString.indexOf(\"o\") = " + testString.indexOf("o"));
        System.out.println("testString.indexOf(\"o\", 6) = " + testString.indexOf("o", 6));
        System.out.println("testString.indexOf(\"z\") = " + testString.indexOf("z"));

        System.out.println("testString.isBlank() = " + testString.isBlank());

        System.out.println("testString.isEmpty() = " + testString.isEmpty());

        System.out.println("testString.lastIndexOf(\"o\") = " + testString.lastIndexOf("o"));
        System.out.println("testString.lastIndexOf(\"o\", 6) = " + testString.lastIndexOf("o", 6));
        System.out.println("testString.lastIndexOf(\"z\") = " + testString.lastIndexOf("z"));

        System.out.println("testString.matches(\"ello\") = " + testString.matches("ello"));
        System.out.println("testString.matches(\"WORLD\") = " + testString.matches("WORLD"));

        System.out.println("testString.repeat(2) = " + testString.repeat(2));

        System.out.println("testString.replace(\"o\", \"Z\") = "
                + testString.replace("o", "Z"));
        System.out.println("testString.replace(\"World\", \"Earth\") = "
                + testString.replace("World", "Earth"));

        System.out.println("testString.replaceAll(\"o\", \"zzz\") = "
                + testString.replaceAll("o", "zzz"));

        System.out.println("testString.replaceFirst(\"Hello\", \"Earth\") = "
                + testString.replaceFirst("World", "Earth"));

        System.out.println(testString.split(","));

        System.out.println("testString.startsWith(\"Hello\") = " + testString.startsWith("Hello"));

        System.out.println("testString.strip() = " + testString.strip());
        System.out.println("\"   a bb  ccc   \".strip() = " + "   a bb  ccc   ".strip());

        System.out.println("\"   a bb  ccc   \".stripLeading() = " + "   a bb  ccc   ".stripLeading());

        System.out.println("\"   a bb  ccc   \".stripTrailing() = " + "   a bb  ccc   ".stripTrailing());

        System.out.println("testString.substring(5) = " + testString.substring(5));
        System.out.println("testString.substring(5, 10) = " + testString.substring(5, 10));

        System.out.println("testString.toCharArray() = " + testString.toCharArray());

        System.out.println("testString.toLowerCase() = " + testString.toLowerCase());

        System.out.println("testString.toUpperCase() = " + testString.toUpperCase());

        System.out.println("\"   a bb  ccc   \".trim() = " + "   a bb  ccc   ".trim());

        System.out.println("testString.subSequence(3, 8) = " + testString.subSequence(3, 8));

    }

}
