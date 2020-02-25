package ru.itsjava.collections.list.my_linked_list;

public class MyLinkedListPracticeRunner {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(null);
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
        myLinkedList.add("Cat");
        myLinkedList.add("Dog");
        System.out.println(myLinkedList.toString());
        myLinkedList.add(0,"Tiger");
        System.out.println(myLinkedList.toString());
        myLinkedList.add(1,"Wolf");
        System.out.println(myLinkedList.toString());
        myLinkedList.add(4,"Bear");
        System.out.println(myLinkedList.toString());
        System.out.println("myLinkedList.subList(1, 3) = " + myLinkedList.subList(1, 3));
        //System.out.println(myLinkedList.toString());
        myLinkedList.add("Wolf");
        System.out.println(myLinkedList.toString());
        System.out.println("myLinkedList.indexOf(\"Wolf\") = " + myLinkedList.indexOf("Wolf"));
        System.out.println("myLinkedList.lastIndexOf(\"Wolf\") = " + myLinkedList.lastIndexOf("Wolf"));

    }
}
