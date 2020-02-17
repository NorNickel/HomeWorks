package ru.itsjava.collections.list_practice;


import ru.itsjava.oop.train.Man;

public class MyArrayListRunner {
    public static void main(String[] args) {
        MyArrayList manList = new MyArrayList();
        manList.add(new Man("Vasya", 20, 190, 100, 500, null));
        manList.add(new Man("Serega", 25, 180, 90, 400, null));
        System.out.println(manList.toString());
        System.out.println("manList.size() = " + manList.size());
        manList.add(new Man("A", 35, 187, 87, 800, null));
        manList.add(new Man("B", 33, 182, 79, 560, null));
        manList.add(new Man("C", 35, 187, 87, 800, null));
        manList.add(new Man("D", 33, 182, 79, 560, null));
        manList.add(new Man("E", 35, 187, 87, 800, null));
        manList.add(new Man("F", 33, 182, 79, 560, null));
        manList.add(new Man("G", 35, 187, 87, 800, null));
        Man ivan = new Man("Ivan", 60, 200, 120, 560, null);
        manList.add(ivan);
        Man alex = new Man("Alex", 70, 150, 69, 800, null);
        manList.add(alex);
        System.out.println(manList.toString());
        System.out.println("manList.size() = " + manList.size());
        manList.remove(alex);
        manList.remove(ivan);
        System.out.println(manList.toString());
        System.out.println("manList.size() = " + manList.size());
    }
}
