package ru.spb.aog.patterns.singleton;
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

public class SingletonOnDemandHolder {
    // #1. Объявляем приватным конструктор класса:
    private SingletonOnDemandHolder() {};

    // #2. Объявляем внутренний статический класс с "константой" - новым объектом Singleton
    private static class SingletonHolder {
        private final static SingletonOnDemandHolder instance = new SingletonOnDemandHolder();
    }

    // #3. Объявляем статический создающий метод, который будет использоваться для получения одиночки:
    public static SingletonOnDemandHolder getInstance() {
        return SingletonHolder.instance;
    }
}
