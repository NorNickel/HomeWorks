package ru.itsjava.methods.compare_to_and_clone;

    /* Задача: для класса SuperCat реализовать методы compareTo() и clone()
    и отсортировать массив из объектов SuperCat. Часть объектов должно быть
    создано через метод clone()
     */

import java.util.Arrays;

public class SuperCatHome {

    public static void main(String[] args) throws CloneNotSupportedException {

        SuperCat cat1 = new SuperCat("Murzik", 100);
        SuperCat cat2 = new SuperCat("Barsik", 200);
        SuperCat cat3 = new SuperCat("Vasya", 150);
        SuperCat cat4 = (SuperCat) cat1.clone(); // Murzik has been cloned
        SuperCat cat5 = (SuperCat) cat2.clone(); // Barsik has been cloned

        SuperCat[] superCatsArray = new SuperCat[] {cat1, cat2, cat3, cat4, cat5};

        Arrays.sort(superCatsArray);

        System.out.println(Arrays.toString(superCatsArray));
    }
}
