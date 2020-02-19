package ru.itsjava.collections.list.linked_list;

import java.util.*;
import java.util.function.UnaryOperator;

//ДЗ Generics + все методы
public class MyLinkedList {
    private Node head;

    public MyLinkedList() {

    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        if (isEmpty()) {
            head = new Node(o, null);
            return true;
        }
        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new Node(o, null));
        return true;
    }

    public boolean remove(Object o) {
        Node prevNode = null;
        Node curNode = head;
        while (curNode != null){
            if (curNode.getValue().equals(o)) {
                if (prevNode == null) {
                    head = curNode.getNext();
                    return true;
                }
                prevNode.setNext(curNode.getNext());
                return true;
            }
            prevNode = curNode;
            curNode = curNode.getNext();
        }
        return true;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void replaceAll(UnaryOperator operator) {

    }

    public void sort(Comparator c) {

    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public Spliterator spliterator() {
        return null;
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

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder("MyLinkedList:{");
        Node node = head;
        while (node != null){
            strBuilder.append('[' + node.getValue().toString() + ']');
            node = node.getNext();
        }
        strBuilder.append('}');
        return strBuilder.toString();
    }
}
