package ru.spb.aog.threads.creating;

public class Printer implements Runnable {
    private String message;
    private int count;
    private long millis;

    public Printer(String message, int count, long millis) {
        this.message = message;
        this.count = count;
        this.millis = millis;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }
    }
}
