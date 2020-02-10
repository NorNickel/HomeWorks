package ru.itsjava.runtimeexception;

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
