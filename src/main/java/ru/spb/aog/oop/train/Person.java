package ru.spb.aog.oop.train;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public double getHeight() { return height; }

    public void setHeight(float height) { this.height = height; }

    public double getWeight() { return weight; }

    public void setWeight(float weight) { this.weight = weight; }

    @Override
    public String toString() {
        return "name = " + name +
                ", age = " + age + " yo" +
                ", height = " + height + " sm" +
                ", weight = " + weight + " kg";
    }
}
