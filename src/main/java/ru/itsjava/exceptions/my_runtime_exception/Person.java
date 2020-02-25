package ru.itsjava.exceptions.my_runtime_exception;

public class Person {
    private String name;
    private boolean isRelative;

    public Person(String name, boolean isRelative) throws MyRuntimeException {
        this.name = name;
        if (isRelative == false){
            throw new MyRuntimeException();
        }
        this.isRelative = true;
    }

}
