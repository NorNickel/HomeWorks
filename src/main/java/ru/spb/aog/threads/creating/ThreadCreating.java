package ru.spb.aog.threads.creating;
// Потоки. Создать разными способами потоки. Через Thread, Runnable.
// Написать программу, которая выводит любое сообщение раз в 5 секунд.

public class ThreadCreating {

    public static void main(String[] args) {
        createThreadMethodOne();
        createThreadMethodTwo();
        createThreadMethodThree();
    }

    public static void createThreadMethodOne() {
        // Создание нового потока
        // с использованием объекта класса, реализующего интерфейс Runnable
        Printer printer = new Printer(
                "Thread created by 'method one'", 10, 300);
        Thread newThread = new Thread(printer);
        newThread.start();
    }

    public static void createThreadMethodTwo(){
        // Создание нового потока
        // с использованием анонимного класса
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Printer printer = new Printer(
                        "Thread created by 'method two'", 10, 300);
                printer.run();
            }
        };
        Thread newThread = new Thread(runnable);
        newThread.start();
    }

    public static void createThreadMethodThree(){
        // Создание нового потока
        // с использованием лямбда выражения
        new Thread(() -> {
            Printer printer = new Printer(
                    "Thread created by 'method three'", 10, 300);
            printer.run();
        }).start();
    }

}
