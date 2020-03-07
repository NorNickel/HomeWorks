package ru.itsjava.enums.practice;

import java.util.Arrays;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println(Seasons.SPRING.name());
        Seasons[] seasons = Seasons.values();
        System.out.println(Arrays.toString(seasons));

        for (Seasons season : Seasons.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        for (Colors color : Colors.values()) {
            color.printColorNumber();
        }
    }
}
