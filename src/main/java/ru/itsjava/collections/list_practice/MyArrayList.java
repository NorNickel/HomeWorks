package ru.itsjava.collections.list_practice;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {
    private Object[] array;
    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int length) {
        array = new Object[length];
        this.size = 0;
    }

    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++){
            if (array[i].equals(o)){
                return true;
            }
        }
        return false;
    }
    
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public boolean add(Object o) {
        if (array.length == size){
            Object[] tempArray = new Object[(3 * array.length / 2) + 1];
            for (int i = 0; i < size; i++){
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
        array[size] = o;
        size++;
        return true;
    }

    @Override
    public String toString(){
        StringBuilder resStrBuilder = new StringBuilder("MyArrayList{\n");
        for (int i = 0; i < size; i++){
            resStrBuilder.append("[" + array[i].toString() + "]");
            resStrBuilder.append(i == size - 1 ? "" : ",\n");
        }
        resStrBuilder.append("\n}");
        return resStrBuilder.toString();
    }

    public boolean remove(Object o) {
        int indexDeleted = -1;
        for (int i = 0; i < size; i++){
            if (indexDeleted != -1 || array[i].equals(o)){
                indexDeleted = i;
                //break;
            }
            if (indexDeleted != -1 && i != size - 1){

            }
        }
        /*if (indexDeleted != -1){
            for (int i = indexDeleted; i < size - 1; i++){
                array[i] = array[i+1];
            }
            array[size - 1] = null;
            size--;
            return true;
        }*/
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }
    
    public void clear() {

    }

    public Object get(int index) {
        return null;
    }
    
    public int indexOf(Object o) {
        return 0;
    }

    public boolean containsAll(Collection c) {
        return false;
    }
}
