package ru.spb.aog.threads.merge_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MergeSort {

    public static void main(String[] args) throws InterruptedException {
        int[] numberArray1 = createNumberArray(3);
        int[] numberArray2 = createNumberArray(3);
        int[] numberArray3 = createNumberArray(3);

        System.out.println(Arrays.toString(numberArray1));
        System.out.println(Arrays.toString(numberArray2));
        System.out.println(Arrays.toString(numberArray3));

        Date dateStart = new Date();

        Thread[] threads = new Thread[3];
        threads[0] = new Thread(new SortArray(numberArray1));
        threads[0].start();
        threads[0].join();
        System.out.println(Arrays.toString(numberArray1));

        //for (Thread thread : threads) {
        //    thread.join();
        //}

        System.out.println(Arrays.toString(numberArray1));
        System.out.println(Arrays.toString(numberArray2));
        System.out.println(Arrays.toString(numberArray3));
/*
        numberArray1 = sortArray(numberArray1);
        numberArray2 = sortArray(numberArray2);
        numberArray3 = sortArray(numberArray3);
 */

        Date dateEnd = new Date();
        System.out.println(dateEnd.getTime() - dateStart.getTime());

        System.out.println("End");
    }

    public static int[] createNumberArray(int size) {
        int[] numberArray = new int[size];
        for (int i = 0; i < size; i++) {
            numberArray[i] = (int)(Math.random() * 100);
        }
        return numberArray;
    }

    static class SortArray implements Runnable {
            private int[] array;

            public SortArray(int[] array) {
                this.array = array;
            }

            public int[] getArray() { return array; }

            @Override
            public void run() {
                array = sortArray(array);
            }
    }

    public static int [] sortArray(int[] arrayA){ // сортировка Массива который передается в функцию
        System.out.println("sortArray()");
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        int [] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        int [] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArrays(arrayB, arrayC);
    }

    public static int [] mergeArrays(int [] arrayA, int [] arrayB) {

        int [] result = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < result.length; i++) {
            if (positionA == arrayA.length){
                result[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                result[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA] < arrayB[positionB]) {
                result[i] = arrayA[positionA];
                positionA++;
            } else {
                result[i] = arrayB[positionB];
                positionB++;
            }
        }
        return result;
    }

}
