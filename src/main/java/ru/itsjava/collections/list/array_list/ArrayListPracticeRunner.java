package ru.itsjava.collections.list.array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPracticeRunner {

    public static void main(String[] args){
        System.out.println("Дополнительные задачи по теме работа с ArrayList.");

        System.out.println("\n0. Создание списков: (Используя конструктор)");

        System.out.println("а). Создать пустой список");
        List<Integer> numberList = new ArrayList<>(); // size = 0
        System.out.println(numberList.toString());

        System.out.println("б). Создать список размером 20");
        numberList = new ArrayList<>(20); // size = 0
        System.out.println(numberList.toString());

        System.out.println("Заполняем numberList значениями");
        for (int i = 0; i < 10; i++){ numberList.add(10 + i * 10);}
        System.out.println(numberList.toString());

        System.out.println("\n1. Получить элемент по индексу:");

        System.out.println("а). Получить первый элемент");
        System.out.println("numberList.get(0) = " + numberList.get(0));

        System.out.println("б). Получить последний элемент");
        System.out.println("numberList.get(numberList.size() - 1) = "
                + numberList.get(numberList.size() - 1));

        System.out.println("\n2. Задачи на вставку элемента:");

        System.out.println("а) Добавить подряд 5 элементов.");
        for (int i = 0; i < 5; i++){
            numberList.add(10 + i * 80);
        }
        System.out.println(numberList.toString());

        System.out.println("б) Добавить 70 в третию позицию.");
        numberList.add(3, 70);
        System.out.println(numberList.toString());

        System.out.println("Добавить 90 в первую позицию.");
        numberList.add(1, 90);
        System.out.println(numberList.toString());

        System.out.println("в) Записать в новый список все элементы предыдущего списка.");
        List<Integer> numberListNew = new ArrayList<>(numberList);
        // или numberListNew.addAll(numberList), но компилятору больше нравится вариант выше;
        System.out.println("Новый список: " + numberListNew.toString());

        System.out.println("\n3. Задачи на удаление элементов: (Используя методы)");

        System.out.println("а) Удалить элемент по значению 100");
        numberList.remove(Integer.valueOf(100));
        System.out.println(numberList.toString());

        System.out.println("б) Удалить элемент по индексу 3");
        numberList.remove(3);
        System.out.println(numberList.toString());

        System.out.println("\n4. Проверить наличие элемента со значением 50");
        System.out.println("numberList.contains((int) 50) = "
                + numberList.contains(50));

        System.out.println("\n5. Вывод списка:");

        System.out.println("а) Вывести список на экран в формате: List: {10; 25; 50}");
        printList(numberList);

        System.out.println("\n6. Отфильтровать список вернуть записи по некоторому условию:");

        System.out.println("а) Условие на индекс: Индекс делится на 3");
        List<Integer> numberListFiltered = new ArrayList<>(numberList.size() / 3);
        for (int i = 0; i < numberList.size(); i += 3){
            numberListFiltered.add(numberList.get(i));
        }
        System.out.println(numberListFiltered.toString());

        System.out.println("б) Условие на значение: Вернуть количество элементов, которые равны 90");
        int count = 0;
        for (int number : numberList){
            if (number == 90){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("\n7. Пропустить несколько первых элементов");
        System.out.println("а) Пропустить первые 3 элемента в списке.");
        numberListFiltered.clear();
        for (int i = 3; i < numberList.size(); i++){
            numberListFiltered.add(numberList.get(i));
        }
        System.out.println(numberListFiltered.toString());

        System.out.println("6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию");
        System.out.println("а) Пропустить первые 2 элемента, которые равные 90");
        numberListFiltered.clear();
        count = 0;
        for (Integer integer : numberList) {
            if (integer != 90 || ++count > 2) {
                numberListFiltered.add(integer);
            }
        }
        System.out.println(numberListFiltered.toString());

        System.out.println("\n8. Вернуть первый подходящий элемент:");
        System.out.println("а) Возращаем Первый элемент Делящийся на 3.");
        int result = -1;
        for (int number : numberList){
            if (number % 3 == 0){
                result = number;
                break;
            }
        }
        if (result != -1) {
            System.out.println("Результат = " + result);
        } else {
            System.out.println("Таких элементов нет");
        }

        System.out.println("\n9. Возвращаем все элементы удовлетворяющие условию:");
        System.out.println("а) Возвращаем все элементы делящиеся на 3");
        numberListFiltered.clear();
        for (int number : numberList){
            if (number % 3 == 0){
                numberListFiltered.add(number);
            }
        }
        System.out.println(numberListFiltered.toString());

        System.out.println("\n10. Создать класс Person и заполнить ArrayList объектами Person.");
        List<Person> personList = new ArrayList<>(5);
        personList.add(new Person(Person.MERGE_MAN, "Никита", 25 ));
        personList.add(new Person(Person.MERGE_WOMAN, "Александра", 25 ));
        personList.add(new Person(Person.MERGE_MAN, "Наутилус", 32 ));
        personList.add(new Person(Person.MERGE_WOMAN, "Эмма", 10  ));
        personList.add(new Person(Person.MERGE_MAN, "Нурмагомед", 26 ));
        // personList.add(new Person(Person.MERGE_MAN, "", -9 )); // WrongPersonParametersException
        System.out.println(personList.toString());

        System.out.println("а) Вернуть всех военнообязанных мужчин (пол), которым меньше 27");
        System.out.println("и больше 18 и имя которых начинается на Н");
        List<Person> personListFiltered = new ArrayList<>();
        int countWomen = 0;
        int sumWomanAges = 0;
        for (Person person : personList){
            if (person.getMerge() == Person.MERGE_MAN
                    && (person.getAge() >= 18 && person.getAge() < 27 )
                    && person.getName().substring(0, 1).equalsIgnoreCase("Н")){
                personListFiltered.add(person);
            }
            if (person.getMerge() == Person.MERGE_WOMAN){
                countWomen++;
                sumWomanAges += person.getAge();
            }
        }
        System.out.println(personListFiltered.toString());

        System.out.println("б) Найти средний возраст всех женщин.");
        System.out.println("Результат = " + ((double) sumWomanAges / countWomen));

    }

    public static void printList(List arrayList){
        System.out.print("List: {");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i).toString() +
                    (i != arrayList.size() - 1 ? "; " : ""));
        }
        System.out.print("}\n");
    }

}
