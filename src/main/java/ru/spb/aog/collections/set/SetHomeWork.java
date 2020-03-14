package ru.spb.aog.collections.set;

// Домашнее задание по работе с коллекциями Set

import java.util.HashSet;
import java.util.Set;

public class SetHomeWork {

    public static void main(String[] args) {
        // 1. Создать множество.
        Set<String> set = new HashSet<>();

        // 2. Добавить элемент. Добавить дубликат.
        set.add("Hello");
        set.add("World");
        set.add("Hello");

        System.out.println("Множество:");
        printSet(set);

        // 3. Удалить элемент из множества.
        set.remove("Hello");

        System.out.println("Множество после удаления строки \"Hello\":");
        printSet(set);
    }

    public static void printSet(Set<String> set) {
        StringBuilder builder = new StringBuilder();
        builder.append('{');
        for (String setElement : set) {
            builder.append(setElement + ", ");
        }
        if (set.size() != 0) {
            int len = builder.length();
            builder.delete(len - 2, len);
        }
        builder.append('}');
        System.out.println(builder);
    }

}
