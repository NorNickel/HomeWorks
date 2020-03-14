package ru.itsjava.patterns.singleton.inner_class;
/*
* Реализация Singleton с использованием внутреннего класса
* ("On Demand Holder")
*
* + Ленивая инициализация
* + Потокобезопасность
* + Высокая производительность
* - Невозможно использовать для не статических полей класса
* - Обработка исключений в конструкторе
*
* Используется тогда, когда конструктор класса не вызывает опасений создания исключительных ситуаций
 */

public class Singleton {
    // #1. Объявляем приватным конструктор класса:
    private Singleton() {};

    // #2. Объявляем внутренний статический класс с "константой" - новым объектом Singleton
    private static class SingletonHolder {
        private final static Singleton instance = new Singleton();
    }

    // #3. Объявляем статический создающий метод, который будет использоваться для получения одиночки:
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
