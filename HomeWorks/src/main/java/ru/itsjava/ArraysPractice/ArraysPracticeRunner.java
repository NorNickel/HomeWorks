package ru.itsjava.ArraysPractice;

import java.util.Arrays;

public class ArraysPracticeRunner {
    public static void main(String[] args) {
        int[] exampleArray = getIntArrayExample();
        ArraysMethods.printArray(exampleArray);
        System.out.println("Position of 2: " + ArraysMethods.binarySearch(exampleArray, 2));
        System.out.println("Position of 5: " + ArraysMethods.binarySearch(exampleArray, 5));
        System.out.println("Position of 6: " + ArraysMethods.binarySearch(exampleArray, 6));
        exampleArray = ArraysMethods.mergeTwoSortedArrays(exampleArray, exampleArray);
        ArraysMethods.printArray(exampleArray);
    }

    public static int[] getIntArrayExample(){
        //int[] exampleArray = new int[50];

        return new int[]{1,2,2,2,2,3,5,5,5,5,5,5,5,5,7,7,8,8,8};

/*        for (int i = 0; i < exampleArray.length; i++) {
            exampleArray[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(exampleArray);
        return exampleArray;

 */
    }
}
