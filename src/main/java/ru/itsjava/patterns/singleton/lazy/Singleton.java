package ru.itsjava.patterns.singleton.lazy;
/*
* Реализация Singleton с "ленивой" инициализацией
*
* + Ленивая инициализация
* - Потокобезопасность
*
* Решение подходит исключительно для однопоточных приложений.
 */

public class Singleton {

    // #1. Добавляем в класс приватное статическое поле, содержащее одиночный объект:
    private static Singleton instance;

    // #2. Объявляем приватным конструктор класса:
    private Singleton() {};

    // #3. Объявляем статический создающий метод, который будет использоваться для получения одиночки:
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
