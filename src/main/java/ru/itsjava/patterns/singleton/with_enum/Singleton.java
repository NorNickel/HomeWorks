package ru.itsjava.patterns.singleton.with_enum;
/*
* Реализация Singleton в виде enum
*
* + Сериализация
* + Потокобезопасность
* + Возможность использования EnumSet, EnumMap и т.д.
* - Не ленивая инициализация
 */

public enum Singleton {
    INSTANCE;
}
