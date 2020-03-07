package ru.itsjava.threads.sleep;
// Написать программу, которая выводит любое сообщение раз в 5 секунд.

public class OneMessageInFiveSeconds {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread.sleep(5000);
            System.out.println("Hello, Vitaliy!");
        }
    }
}
