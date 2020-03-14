package ru.spb.aog.patterns.singleton;
/*
* Реализация Singleton со статическим полем с объектом
*
* + Потокобезопасность
* - Не ленивая инициализация
* - Обработка исключений в конструкторе
 */

public class SingletonStaticField {
    // #1. Добавляем в класс приватное статическое поле,
    // содержащее одиночный объект, и сразу его создаем:
    private static SingletonStaticField instance = new SingletonStaticField();

    // #2. Объявляем приватным конструктор класса:
    private SingletonStaticField() {};

    // #3. Объявляем статический создающий метод, который будет использоваться для получения одиночки:
    public static SingletonStaticField getInstance() {
        return instance;
    }
}
