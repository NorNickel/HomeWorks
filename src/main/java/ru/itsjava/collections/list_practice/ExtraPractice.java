package ru.itsjava.collections.list_practice;

import java.util.ArrayList;
import java.util.List;

public class ExtraPractice {
    public static void main(String[] args) {
        // 0. Содание списков: (Используя конструктор)

        // а). Создать пустой список
        List<Integer> numberList = new ArrayList<>();

        // б). Создать список размером 20
        List<Integer> numberList20 = new ArrayList<>(20);
        System.out.println("numberList20.size() = " + numberList20.size());

        for (int i = 0; i < 20; i++){ numberList20.add(i);} // заполняем значениями

        // 1. Получить элемент по индексу:

        // а). Получить первый элемент
        System.out.println("numberList.get(0) = " + numberList20.get(0));

        // б). Получить последний элемент
        System.out.println("numberList.get(numberList.size() - 1) = "
                + numberList20.get(numberList20.size() - 1));

        // 2. Задачи на вставку элемента:

        // а) Добавить подряд 5 элементов.
        for (int i = 0; i < 5; i++){
            numberList.add((int) (Math.random() * 100));
        }

        // б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
        numberList.add(3, 999);
        numberList.add(1, -999);

        // в) Записать в новый список все элементы предыдущего списка.
        List<Integer> numberListNew = new ArrayList<>();
        numberListNew.addAll(numberList);

        // 3. Задачи на удаление элементов: (Используя методы)
        // а) Удалить элемент по значению
        numberList.remove(Integer.valueOf(999));

        // б) Удалить элемент по индексу
        numberList.remove(3);

        // 4. Проверить наличие элемента
        numberList.contains((int) -999);

        // 5. Вывод списка:

        // а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
        System.out.println("numberList.toString() = " + numberList.toString());

        // 6. Отфильтровать список вернуть записи по некоторому условию:

        //а) Условие на индекс: Индекс делится на 3


        // б) Условие на значение: Вернуть количество элементов, которые равны "***"

        // 7. Пропустить несколько первых элементов
        // а) Пропустить первые 3 элемента в списке.

        // 6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
        // а) Пропустить первые 2 элемента, которые равные "****"

        // 8. Вернуть первый подходящий элемент:
        // а) Возращаем Первый элемент Делящийся на 3.

        // 9. Возвращаем все элементы удовлетворяющие условию:
        // а) Возвращаем все элементы делящиеся на 3

        // 10. Создать класс Person.
        // Вернуть всех военнообязанных мужчин (пол), которым меньше 27
        // и больше 18 и имя которых начинается на Н

        // 11. Найти средний возраст всех женщин.*/
    }
}
