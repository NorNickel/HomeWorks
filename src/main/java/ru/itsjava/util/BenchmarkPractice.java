package ru.itsjava.util;

public class BenchmarkPractice {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        long[][] times = new long[100][2];
        int number = 0;
        number = increment(number); // если мы здесь запустим первый раз метод,
                                    // то в цикле операции выполняются с одинаковым временем.
        // Но я все равно соглашусь с Виталием, что так мерить нельзя ))
        for (int i = 0; i < 100; i++){
            times[i][0] = System.nanoTime();
            number = increment(number);
            times[i][1] = System.nanoTime();
        }
        for (int i = 0; i < times.length; i++){
            long start = times[i][0] % 1_000_000;
            long end = times[i][1] % 1_000_000;
            long difference = end - start;
            System.out.println( start + ":" + end + ":" + difference);
        }
    }

    public static int increment(int number){
        return ++number;
    }
}
