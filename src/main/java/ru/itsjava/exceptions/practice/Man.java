package ru.itsjava.exceptions.practice;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws MyBeautifulException {
        if (age < 0)
        {
            throw new MyBeautifulException();
        }
        this.age = age;
    }

}
