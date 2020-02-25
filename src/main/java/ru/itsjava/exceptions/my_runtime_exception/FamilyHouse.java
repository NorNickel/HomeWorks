package ru.itsjava.exceptions.my_runtime_exception;

public class FamilyHouse {
    public static void main(String[] args) {

        try{
            Person father = new Person("Bob", true);
            Person mother = new Person("Anna", true);
            Person unknown = new Person("Elizabeth", false);
        } catch (MyRuntimeException ex) {
            System.err.println("Somebody is not relative!");
            ex.printStackTrace();
        }
    }
}
