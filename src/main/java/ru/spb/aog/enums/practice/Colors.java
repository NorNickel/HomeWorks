package ru.spb.aog.enums.practice;

public enum Colors {
    RED("#1"), GREEN("#2"), BLUE("#3");

    private String value;

    Colors(String value) {
        this.value = value;
    }

    public void printColorNumber() {
        System.out.println("Номер цвета: " + value + ".");
    }
}
