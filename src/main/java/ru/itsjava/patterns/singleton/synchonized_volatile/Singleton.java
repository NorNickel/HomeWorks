package ru.itsjava.patterns.singleton.synchonized_volatile;

/*
* Реализация Singleton с использованием synchronized и volatile
*
* + Ленивая инициализация
* + Высокая производительность
* - Использование модификатора volatile может привести к проблемам
*   производительности в мультипроцессорных системах
 */

public class Singleton {
    // #1. Добавляем в класс приватное статическое поле, содержащее одиночный объект:
    //  используем модификатор volatile для того, чтобы в многопоточном приложении
    //  всегда использовать верное значение объекта
    private static volatile Singleton instance;

    // #2. Объявляем приватным конструктор класса:
    private Singleton() {};

    // #3. Объявляем статический создающий метод, который будет использоваться для получения одиночки:
    //  используем синхронизацию по классу
    public static Singleton getInstance() {
        // Проверяем, есть ли объект, чтобы не использовать synchronized, когда объект уже существует
        if (instance == null) {
            synchronized (Singleton.class) {
                // Проверяем еще раз создан ли объект, уже в блоке synchronized
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
