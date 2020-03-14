package ru.itsjava.patterns.singleton.static_field;
/*
* Реализация Singleton с созданием объекта при статической инициализации класса
*
* + Потокобезопасность
* - Не ленивая инициализация
* - Обработка исключений в конструкторе
 */

public class Singleton {
    // #1. Добавляем в класс приватное статическое поле,
    // содержащее одиночный объект, и сразу его создаем:
    private static Singleton instance = new Singleton();

    // #2. Объявляем приватным конструктор класса:
    private Singleton() {};

    // #3. Объявляем статический создающий метод, который будет использоваться для получения одиночки:
    public static Singleton getInstance() {
        return instance;
    }
}
