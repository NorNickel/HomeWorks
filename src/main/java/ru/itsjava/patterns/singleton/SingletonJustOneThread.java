package ru.itsjava.patterns.singleton;
/*
* Реализация Singleton с "ленивой" инициализацией для однопоточных приложений
*
* + Ленивая инициализация
* - Потокобезопасность
 */

public class SingletonJustOneThread {

    // #1. Добавляем в класс приватное статическое поле, содержащее одиночный объект:
    private static SingletonJustOneThread instance;

    // #2. Объявляем приватным конструктор класса:
    private SingletonJustOneThread() {};

    // #3. Объявляем статический создающий метод, который будет использоваться для получения одиночки:
    public static SingletonJustOneThread getInstance() {
        if (instance == null) {
            instance = new SingletonJustOneThread();
        }
        return instance;
    }
}
