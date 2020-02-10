package ru.itsjava.exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {
        Man alexandr = new Man("Alexandr", 10);
        try {
            alexandr.setAge(5);
        } catch (MyBeautifulException ex){
            System.err.println("Age must be greater than 0");
            ex.printStackTrace();
        } finally {
            System.out.println("Finally");
            System.out.println(alexandr.getAge());
        }
    }

    public static void throwError() throws NullPointerException{
        throw new NullPointerException();
    }
}
