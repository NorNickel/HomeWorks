package ru.itsjava.patterns.singleton;
/*
* Реализация Singleton в виде enum
*
* + Сериализация
* + Потокобезопасность
* + Возможность использования EnumSet, EnumMap и т.д.
* - Не ленивая инициализация
 */

public enum SingletonEnum {
    INSTANCE;
}
