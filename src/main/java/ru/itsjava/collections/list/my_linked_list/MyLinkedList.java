package ru.itsjava.collections.list.my_linked_list;

// Homework: Create own class MyLinkedList with <generics>
// and realize some methods

import java.util.LinkedList;

public class MyLinkedList<E> {

    /*
     * Fields
     */

    private int size;
    private Node<E> first;
    private Node<E> last;


    /*
     * Constructor
     */

    public MyLinkedList(Node<E> first){
        add(first);
    }


    /*
     * Methods
     */

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E element) {
        return -1 != indexOf(element);
    }

    public boolean add(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<E>(last, element, null);
        last = newNode;
        if (l == null) {
            first = last;
        } else {
            l.setNext(last);
        }
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index == size){
            Node<E> newNode = new Node<>(last, element, null);
            linkLast(newNode);
        } else {
            Node<E> node = getNode(index);
            linkBefore(element, node);
        }
    }

    public boolean add(Node<E> first) {
        for (Node<E> cur = first; cur != null; cur = cur.getNext()){
            add(cur.getItem());
        }
        return true;
    }

    public boolean remove(E element) {
        int index = indexOf(element);
        if (index == -1){
            return false;
        }
        remove(index);
        return true;
    }

    public E remove(int index) {
        E element = get(index);
        unlink(index);
        return element;
    }

    public E get(int index) {
        return getNode(index).getItem();
    }

    public E set(int index, E element) {
        Node<E> cur = getNode(index);
        E oldElement = cur.getItem();
        cur.setItem(element);
        return oldElement;
    }

    private Node<E> getNode(int index){
        Node<E> cur;
        if (size % (index + 1)>= 2){
            cur = first;
            for (int i = 1; i < index; i++){
                cur = cur.getNext();
            }
        } else {
            cur = last;
            for (int i = size - 1; i > index; i--){
                cur = cur.getPrev();
            }
        }
        return cur;
    }

    public int indexOf(E element) {
        int index = 0;
        if (element == null){
            for (Node cur = first; cur != null; cur = cur.getNext()){
                if (cur.getItem() == null){
                    return index;
                };
                index++;
            }
        } else {
            for (Node cur = first; cur != null; cur = cur.getNext()){
                if (element.equals(cur.getItem())){
                    return index;
                };
                index++;
            }
        }
        return -1;
    }

    public int lastIndexOf(E element) {
        int index = size - 1;
        if (element == null){
            for (Node cur = last; cur != null; cur = cur.getPrev()){
                if (cur.getItem() == null){
                    return index;
                };
                index--;
            }
        } else {
            for (Node cur = last; cur != null; cur = cur.getPrev()){
                if (element.equals(cur.getItem())){
                    return index;
                };
                index--;
            }
        }
        return -1;
    }

    public MyLinkedList<E> subList(int fromIndex, int toIndex) {
        MyLinkedList<E> result = new MyLinkedList<>(null);
        Node<E> cur = getNode(fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            result.add(cur.getItem());
            cur = cur.getNext();
        }
        return result;
    }

    public Object[] toArray() {
        Object[] resArray = new Object[size];
        int i = 0;
        for (Node<E> cur = first; cur != null; cur = cur.getNext()){
            resArray[i++] = cur.getItem();
        }
        return resArray;
    }


    /*
    * Utility functions for link / unlink nodes
    */

    private void linkFirst(Node<E> node){
        node.setPrev(null);
        node.setNext(first);
        first.setPrev(node);
        first = node;
        size++;
    }

    private void linkLast(Node<E> node){
        node.setPrev(last);
        node.setNext(null);
        last.setNext(node);
        last = node;
        size++;
    }

    private void linkBefore(E element, Node<E> node) {
        Node<E> prev = node.getPrev();
        Node<E> newNode = new Node<>(prev, element, node);
        node.setPrev(newNode);
        if (prev == null)
            first = newNode;
        else
            prev.setNext(newNode);
        size++;
    }

    private E unlink(int index) {
        Node <E> cur = getNode(index);
        E element = cur.getItem();
        unlink(cur);
        return element;
    }

    private E unlink(Node<E> element){
        E removedItem = element.getItem();
        Node<E> next = element.getNext();
        Node<E> prev = element.getPrev();

        if (prev == null){
            first = next;
        } else {
            prev.setNext(next);
            element.setPrev(null);
        }

        if (next == null){
            last = prev;
        } else {
            next.setPrev(prev);
            element.setNext(null);
        }

        element.setItem(null);
        size--;
        return removedItem;
    }


    /*
     * Override functions
     */

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder("MyLinkedList:{");
        for (Node<E> cur = first; cur != null; cur = cur.getNext()){
            strBuilder.append('[' + cur.getItem().toString() + ']');
        }
        strBuilder.append('}');
        return strBuilder.toString();
    }


    /*
     * Unrealized methods
     */

    /*

    public void replaceAll(UnaryOperator operator) {

    }

    public Iterator iterator() {
        return null;
    }

    public Spliterator spliterator() {
        return null;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public void sort(Comparator c) {

    }

    public void clear() {

    }

    public boolean addAll(Collection<E> c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

     */
}
