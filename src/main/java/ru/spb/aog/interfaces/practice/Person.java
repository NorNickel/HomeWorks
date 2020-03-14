package ru.spb.aog.interfaces.practice;

public class Person implements Learnable {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){ return name; }

    public void setName(String name){ this.name = name; }

    @Override
    public void learn(){
        System.out.println("My name is " + name + "and I'm learning now...");
    }
}
