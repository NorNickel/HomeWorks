package ru.itsjava.threads.practice;

public class ThreadsPractice {

    public static void main(String[] args) throws InterruptedException {
        /*System.out.println("Start");
        Printer printer = new Printer("Run", 300);
        Thread thread = new Thread(printer);
        thread.start();
        thread.join();
        System.out.println("Other cycle start");

        for (int i = 0; i < 10; i++) {
            Thread.sleep(300);
            System.out.println("S1");
        }
        System.out.println("End");
         */
        Thread.currentThread().join(); // dead lock

        // анонимный класс
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Test");
            }
        };
        Thread t = new Thread(runnable);
        t.start();

        Thread t2 = new Thread(() -> {
            System.out.println("Yo!");
            System.out.println("!!!");
        });
        t2.start();


        new Thread(() -> {
            System.out.println("Yo!");
            System.out.println("!!!");
        }).start();
    }
}
