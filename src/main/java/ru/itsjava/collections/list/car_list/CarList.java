package ru.itsjava.collections.list.car_list;

import java.util.*;

public class CarList<T>{

    private T[] array;
    private int size = 0;

    public CarList() {
        this.array = (T[]) new Object[10];
    }

    public int size() {
        return size;
    }

    public void sort() {
        Arrays.sort(array, 0, size);
    }

    public void trimToSize() {
        array = Arrays.copyOf(array, size);
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = array.length;
        if (oldCapacity < minCapacity){
            array = grow(minCapacity);
        }
    }

    private T[] grow(){
        return grow(getNewLength());
    }

    private T[] grow(int minCapacity){
        int oldCapacity = array.length;
        int newCapacity = getNewLength(minCapacity);
        if (oldCapacity > 0){
            return Arrays.copyOf(array, newCapacity);
        } else {
            return (T[]) new Object[Math.max(newCapacity, newCapacity)];
        }
    }

    private int getNewLength(){
        int ARRAY_MIN_CAPACITY = 10;
        return getNewLength(ARRAY_MIN_CAPACITY);
    }

    private int getNewLength(int minCapacity){
        return Math.max(array.length * 3 / 2 + 1, minCapacity);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(T o) {
        if (o == null){
            for (int i = 0; i < size; i++){
                if (array[i] == null){
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++){
                if (array[i].equals(o)){
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(T o) {
        if (o == null){
            for (int i = size - 1; i >= 0; i--){
                if (array[i] == null){
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--){
                if (array[i].equals(o)){
                    return i;
                }
            }
        }
        return -1;
    }

    public T[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public T get(int index) {
        return array[index];
    }

    public T set(int index, T element) {
        T oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

    public boolean add(T o) {
        add(size, o);
        return true;
    }

    public void add(int index, T element) {
        if (size == array.length){
            array = grow();
        }
        if (index == size){
            array[index] = element;
        } else {
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = element;
        }
        size++;
    }

    public Object remove(int index) {
        Object element = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
        return element;
    }

    public boolean remove(T o) {
        int index = indexOf(o);
        if (index > 0){
            remove(index);
            return true;
        }
        return false;
    }

    protected void removeRange(int fromIndex, int toIndex) {
        int countElementsRemove = toIndex - fromIndex;
        if (countElementsRemove != 0) {
            System.arraycopy(array, toIndex, array, fromIndex, size - countElementsRemove);
            for (int i = size - countElementsRemove; i < size; i++) {
                array[i] = null;
            }
            size -= countElementsRemove;
        }
    }

    public boolean removeAll(CarList<T> carList) {
        for (int i = 0; i < carList.size(); i++){
            T element;
            if (this.contains(element = carList.get(i))){
                remove(element);
            }
        }
        return true;
    }

    public void clear() {
        for (int i = 0; i < size; i++){
            array[i] = null;
        }
        size = 0;
    }

    public boolean addAll(CarList<T> carList) {
        return addAll(size, carList);
    }

    public boolean addAll(int index, CarList<T> carList) {
        int newLength = this.size + carList.size();
        if (newLength > array.length){
            array = grow(newLength);
        }
        if (index == this.size){
            System.arraycopy(carList.toArray(), 0, array, size, carList.size());
        } else {
            System.arraycopy(array, index, array, index + carList.size() - 1, this.size() - index - 1);
            System.arraycopy(carList.toArray(), 0, array, index, carList.size() - 1);
        }
        size += carList.size();
        return true;
    }

/* Unrealized methods:

    public boolean retainAll(Collection c) {
        return super.retainAll(c);
    }

    @Override
    public ListIterator listIterator(int index) {
        return super.listIterator(index);
    }

    @Override
    public ListIterator listIterator() {
        return super.listIterator();
    }

    @Override
    public Iterator iterator() {
        return super.iterator();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }

    @Override
    public void forEach(Consumer action) {
        super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return super.spliterator();
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return super.removeIf(filter);
    }

    public void replaceAll(UnaryOperator operator) {
        super.replaceAll(operator);
    }

 */

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (int i = 0; i < size; i++){
            stringBuilder.append("#" + i + ": " + array[i].toString() +
                    (i != size - 1 ? ",\n" : ""));
        }
        stringBuilder.append("} (size = " + size + "; length = " + array.length + ')');
        return stringBuilder.toString();
    }

}
