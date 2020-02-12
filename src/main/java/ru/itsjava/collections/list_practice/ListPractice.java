package ru.itsjava.collections.list_practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        /*List<String> namesList = new ArrayList<>();
        namesList.add("Александр");
        namesList.add("ИВАН");
        namesList.add("Виталий");
        namesList.add("ИваН");
        namesList.add("Дмитрий");
        namesList.add("иван");
        System.out.println("namesList.get(0) = " + namesList.get(0));
        System.out.println("namesList.size() = " + namesList.size());
        System.out.println("namesList.contains(\"Александр\") = "
                + namesList.contains("Александр"));
        //namesList.remove(0);
        //System.out.println("namesList.size() = " + namesList.size());
        //namesList.clear();
        //System.out.println("namesList.size() = " + namesList.size());
/*
        System.out.println("Вывод списка (for each)");
        for (String s : namesList){
            System.out.println(s);
        }

        System.out.println("Вывод списка (for)");
        for (int i = 0; i < namesList.size(); i++){
            System.out.println(namesList.get(i));
        }

        System.out.println("Вывод списка в обратном порядке (for)");
        for (int i = namesList.size() - 1; i >= 0; i--){
            System.out.println(namesList.get(i));
        }

        // Найти элементы списка, которые равны "Иван" и вывести их индексы
        List<Integer> indexesList = new ArrayList<>();
        for (int i = 0; i < namesList.size(); i++){
            if (namesList.get(i).equalsIgnoreCase("Иван")){
                indexesList.add(i);
            }
        }

        if (indexesList.isEmpty()){
            System.out.println("Иванов нет");
        } else {
            System.out.print("Индексы Иванов: ");
            for (int i = 0; i < indexesList.size(); i++){
                System.out.print(indexesList.get(i)
                        + (i != indexesList.size() - 1 ? ", " : ""));
            }
        }*/
        List<Integer> numberList = new ArrayList<>();
        numberList.add(0);
        numberList.add(12);
        numberList.add(16);
        numberList.add(27);
        for (int number : numberList){
            System.out.println(number);
        }
        List<IndexValue> resultList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++){
            if (numberList.get(i) != 0 && numberList.get(i) % 3 == 0){
                resultList.add(new IndexValue(i, numberList.get(i)));
            }
        }
        for (IndexValue indexValue : resultList){
            System.out.println("Индекс: " + indexValue.index + ": " +
                    "значение: " + indexValue.value);
        }
    }

    private static class IndexValue{
        int index, value;

        IndexValue(int index, int value){
            this.index = index;
            this.value = value;
        }
    }



}
