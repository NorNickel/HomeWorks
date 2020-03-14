package ru.spb.aog.threads.deadlock;
/* Deadlock describes a situation where two or more threads
* are blocked forever, waiting for each other.
*
* Example from Java documentation
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

public class DeadLock {

    @AllArgsConstructor
    @Getter
    static class Friend {

        private final String name;

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                    + " has bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                    + " has bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final Friend andrey = new Friend("Andrey");
        final Friend vitaliy = new Friend("Vitaliy");
        new Thread(new Runnable() {
            @Override
            public void run() {
                andrey.bow(vitaliy);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                vitaliy.bow(andrey);
            }
        }).start();
    }
}
