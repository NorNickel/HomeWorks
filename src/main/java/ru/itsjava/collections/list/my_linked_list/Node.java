package ru.itsjava.collections.list.my_linked_list;

public class Node<E> {
    private E item;
    private Node<E> next;
    private Node<E> prev;

    public Node(Node<E> prev, E element, Node<E> next) {
        this.prev = prev;
        this.item = element;
        this.next = next;
    }

    public E getItem() { return item; }

    public void setItem(E item) { this.item = item; }

    public Node<E> getNext() { return next; }

    public void setNext(Node<E> next) { this.next = next; }

    public Node<E> getPrev() { return prev; }

    public void setPrev(Node<E> prev) { this.prev = prev; }
}
