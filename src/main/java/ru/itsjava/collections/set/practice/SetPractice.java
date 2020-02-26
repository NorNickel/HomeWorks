package ru.itsjava.collections.set.practice;

import ru.itsjava.oop.train.Man;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Hello");
        mySet.add("Vasya");
        mySet.add("Vanya");
        System.out.println(mySet.add("Hello"));

        for (String elem : mySet){
            System.out.println(elem);
        }

        Map<String, Man> myMap = new HashMap<>();

        Man alex = new Man("Alex", 34, 185, 95, 500, null);
        Man alex2 = new Man("Alex", 40, 185, 95, 500, null);
        Man vitaliy = new Man("Vitaliy", 29, 178, 80, 450, null);
        myMap.put("Alex", alex);
        myMap.put("Alex", alex2);
        myMap.put("Vitaliy", vitaliy);
        printMyHashMap(myMap);
    }

    public static void printMyHashMap(Map<String, Man> map){
        /*for (String name : map.keySet()){
            System.out.println(map.get(name).toString());
        }
         */
        for (Map.Entry<String, Man> mapElement : map.entrySet()){
            System.out.println(mapElement.toString());
        }
    }
}
