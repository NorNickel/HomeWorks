package ru.itsjava.arrays.practice;

public class ArraysMethods {
    public static final int NOT_FOUND = -1;

    public static void printArray(int[] array){
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int binarySearch(int[] sortedArray, int item){
        return binarySearch(sortedArray, item, 0, sortedArray.length - 1);
    }

    public static int binarySearch(int[] sortedArray, int item, int right, int left) {
        if (left - right == 1){
            if (sortedArray[left] == item) {
                return left;
            }
            return NOT_FOUND;
        }
        int middle = (left + right) / 2;
        if (sortedArray[middle] >= item){
            return binarySearch(sortedArray, item, right, middle);  //recursion
        } else {
            return binarySearch(sortedArray, item, middle, left);   //recursion
        }
    }

    public static int[] mergeTwoSortedArrays(int[] arrayOne, int[] arrayTwo){
        int positionOne = 0;
        int positionTwo = 0;
        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];
        int positionMerge = 0;
        while (positionOne < arrayOne.length & positionTwo < arrayTwo.length){
            if (arrayOne[positionOne] <= arrayTwo[positionTwo]){
                mergedArray[positionMerge] = arrayOne[positionOne];
                positionOne++;
            } else {
                mergedArray[positionMerge] = arrayTwo[positionTwo];
                positionTwo++;
            }
            positionMerge++;
        }
        for (int i = positionOne; i < arrayOne.length; i++){
            mergedArray[positionMerge] = arrayOne[i];
            positionMerge++;
        }
        for (int i = positionTwo; i < arrayTwo.length; i++){
            mergedArray[positionMerge] = arrayTwo[i];
            positionMerge++;
        }
        return mergedArray;
    }
    //public static int[] mergeSort(int[] array){
        //return mergeSort( )
        //int[] leftArray = new
    //}

}
