package ru.spb.aog.collections.list.array_list;

public class Person {
    private static final String[] MERGE = {"Мужчина", "Женщина"};
    public static final int MERGE_MAN = 0;
    public static final int MERGE_WOMAN = 1;

    private int merge;
    private String name;
    private int age;

    Person(int merge, String name, int age) throws WrongPersonParametersException{
        checkPersonParameters(name, age);
        this.merge = merge;
        this.name = name;
        this.age = age;
    }

    private static void checkPersonParameters(String name, int age)
            throws WrongPersonParametersException{
        StringBuilder errorMessage = new StringBuilder("");
        if (name.length() == 0){
            errorMessage.append("Name cannot have zero length; ");
        }
        if (age < 0) {
            errorMessage.append("Age must be positive; ");
        }
        if (errorMessage.length() != 0){
            throw new WrongPersonParametersException(errorMessage.toString());
        }
    }

    public int getMerge() { return merge; }

    public String getName() { return name; }

    public int getAge() { return age; }

    @Override
    public String toString(){
        return MERGE[merge] + ": " + name + ": возраст = " + age;
    }

}
