package ru.itsjava.patterns.singleton;

/*
* Реализация Singleton с использованием synchronized и volatile
*
* + Ленивая инициализация
* + Высокая производительность
* - Использование модификатора volatile может привести к проблемам
*   производительности в мультипроцессорных системах
 */

public class SingletonSynchronizedAndVolatile {
    // #1. Добавляем в класс приватное статическое поле, содержащее одиночный объект:
    //  используем модификатор volatile для того, чтобы в многопоточном приложении
    //  всегда использовать верное значение объекта
    private static volatile SingletonSynchronizedAndVolatile instance;

    // #2. Объявляем приватным конструктор класса:
    private SingletonSynchronizedAndVolatile() {};

    // #3. Объявляем статический создающий метод, который будет использоваться для получения одиночки:
    //  используем синхронизацию по классу
    public static SingletonSynchronizedAndVolatile getInstance() {
        // Проверяем, есть ли объект, чтобы не использовать synchronized, когда объект уже существует
        if (instance == null) {
            synchronized (SingletonSynchronizedAndVolatile.class) {
                // Проверяем еще раз создан ли объект, уже в блоке synchronized
                if (instance == null) {
                    instance = new SingletonSynchronizedAndVolatile();
                }
            }
        }
        return instance;
    }
}
