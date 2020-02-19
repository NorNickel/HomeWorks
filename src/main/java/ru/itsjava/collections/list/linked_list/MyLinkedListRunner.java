package ru.itsjava.collections.list.linked_list;

import java.util.Arrays;

public class MyLinkedListRunner {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Antelope");
        myLinkedList.add("Tiger");
        myLinkedList.add("Wolf");
        myLinkedList.add("Bear");
        System.out.println(myLinkedList.toString());
        myLinkedList.remove("Wolf");
        System.out.println("After deleting Wolf:" + myLinkedList.toString());
        myLinkedList.remove("Antelope");
        System.out.println("After deleting Antelope:" + myLinkedList.toString());
        myLinkedList.remove("Bear");
        System.out.println("After deleting Bear:" + myLinkedList.toString());
        myLinkedList.remove("Tiger");
        System.out.println("After deleting Tiger:" + myLinkedList.toString());
    }
}
