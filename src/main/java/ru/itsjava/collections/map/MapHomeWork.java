package ru.itsjava.collections.map;

//Домашнее задание по работе с коллекциями Map

import java.util.HashMap;
import java.util.Map;

public class MapHomeWork {

    public static void main(String[] args) {

        // 0. Создание:
        // а). Создадим экземпляр HashMap (Ключ Строка Значение Фрукт)
        Map<String, Fruit> fruits = new HashMap<>();

        // 1. Вставка элементов:
        // а). Добавим 11 элементов
        fruits.put("apricot", new Fruit("абрикос", 0.1));
        fruits.put("greenApple", new Fruit("яблоко", 0.2));
        fruits.put("redApple", new Fruit("яблоко", 0.25));
        fruits.put("yellowApple", new Fruit("ЯблОкО", 0.3));
        fruits.put("avocado", new Fruit("авокадо", 0.15));
        fruits.put("banana", new Fruit("банан", 0.15));
        fruits.put("melon", new Fruit("дыня", 4.0));
        fruits.put("bigApple", new Fruit("яблоко", 1.0));
        fruits.put("peach", new Fruit("персик", 0.2));
        fruits.put("pear", new Fruit("груша", 0.22));
        fruits.put("plum", new Fruit("слива", 0.14));

        printFruits(fruits, "Карта фруктов (fruits): ");

        // б). В новый экзмепляр Map добавим старую карту.
        Map<String, Fruit> copyOfFruits = new HashMap<>(fruits);
        printFruits(copyOfFruits, "Копия карты фруктов (copyOfFruits): ");

        // 2. Получение элемента по ключу
        System.out.println("fruits.get(\"banana\") = " + fruits.get("banana"));
        System.out.println("fruits.get(\"kiwi\") = " + fruits.get("kiwi"));

        // 3. Удаление элемента
        // а). Удалим любой фрукт
        fruits.remove("melon");

        printFruits(fruits, "После удаления по ключу \'melon\': ");

        // 4. Проверка на наличие: ключ и значение
        System.out.println("fruits.containsKey(\"peach\") = "
                + fruits.containsKey("peach"));
        System.out.println("fruits.containsKey(\"kiwi\") = "
                + fruits.containsKey("kiwi"));

        System.out.println("fruits.containsValue(new Fruit (\"персик\", 0.2)) = "
                + fruits.containsValue(new Fruit("персик", 0.2)));
        System.out.println("fruits.containsValue(new Fruit (\"персик\", 0.3)) = "
                + fruits.containsValue(new Fruit("персик", 0.3)));
        System.out.println("fruits.containsValue(new Fruit(\"киви\", 0.1)) = "
                + fruits.containsValue(new Fruit("киви", 0.1)));

        // 5. Вывод Map на экран:
        // a) Вывести все ключи
        System.out.println("Все ключи:");
        for (String key : fruits.keySet()){
            System.out.println(key);
        }

        // б) Вывести все значения
        System.out.println("Все значения:");
        for (Fruit fruit : fruits.values()){
            System.out.println(fruit);
        }

        // в) Вывести все ключи и значения с помощью entrySet
        printFruits(fruits, "Вывод всех пар Ключ - Значение:");

        // 6. Отфильтровать Map вернуть записи по некоторому условию:
        // а) Условие на ключ: вернуть количество ключей, длина которых больше 5
        int count = 0;
        for (String key : fruits.keySet()){
            if (key.length() > 5) {
                count++;
            }
        }
        System.out.println("Количество ключей, длина которых больше 5: " + count);

        // б) Условие на значение: Вернуть количество фруктов "яблоко"
        count = 0;
        for (Fruit fruit : fruits.values()) {
            if (fruit.getName().equals("яблоко")) {
                count++;
            }
        }
        System.out.println("Количество фруктов \"яблоко\": "
                + count);

        // 7. Пропустить несколько элементов
        // а) Пропустить 2 элемента, значения которых 'яблоко', все остальные вывести.
        System.out.println("Пропустить 2 элемента, значения которых 'яблоко'," +
                " все остальные вывести:");
        boolean skip = false;
        count = 0;
        for (Fruit fruit : fruits.values()) {
            if (!skip && fruit.getName().equals("яблоко")) {
                skip = ++count == 2;
                continue;
            }
            System.out.println(fruit);
        }

        // б) Вывести все кроме 2 элементов, ключи которых начинаются на "p"
        System.out.println("Вывести все кроме 2 элементов, " +
                "ключи которых начинаются на \"p\":");
        skip = false;
        count = 0;
        for (Map.Entry<String, Fruit> pair : fruits.entrySet()){
            if (!skip && pair.getKey().charAt(0) == 'p') {
                skip = ++count == 2;
                continue;
            }
            System.out.println(pair.getValue());
        }

        // 8. Вернуть первый подходящий элемент:
        // Возращаем все элементы, значение которых яблоко или ЯблОкО.
        System.out.println("Элементы, значение которых яблоко или ЯблОкО:");
        for (Fruit fruit : fruits.values()) {
            if (fruit.getName().equalsIgnoreCase("яблоко")) {
                System.out.println(fruit);
            }
        }

        // 9. Возвращаем все элементы удовлетворяющие условию:
        // Возвращаем в другую карту фрукты, масса которых менее 0.2
        Map<String, Fruit> smallFruits = new HashMap<>();
        for (Map.Entry<String, Fruit> pair : fruits.entrySet()) {
            Fruit fruit = pair.getValue();
            if (fruit.getWeight() < 0.2) {
                smallFruits.put(pair.getKey(), fruit);
            }
        }
        printFruits(smallFruits, "Фрукты с массой менее 0.2:");

        //10. Найти средний вес всех фруктов.
        count = 0;
        double weightAll = 0;
        for (Fruit fruit : fruits.values()) {
            count++;
            weightAll += fruit.getWeight();
        }
        System.out.println("Средний вес всех фруктов: " + (weightAll / count));

    }

    public static void printFruits(Map<String, Fruit> fruits) {
        printFruits(fruits, "");
    }

    public static void printFruits(Map<String, Fruit> fruits, String message) {
        if (message.length() > 0){
            System.out.println(message);
        }
        for (Map.Entry<String, Fruit> pair : fruits.entrySet()){
            System.out.println("\"" + pair.getKey() + "\" - " + pair.getValue());
        }
    }

}