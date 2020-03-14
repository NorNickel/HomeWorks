package ru.spb.aog.threads.practice;

public class Printer implements Runnable {
    private String message;
    private long millis;

    public Printer(String message, long millis) {
        this.message = message;
        this.millis = millis;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }
    }
}
