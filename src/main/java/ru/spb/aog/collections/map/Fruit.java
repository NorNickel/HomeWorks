package ru.spb.aog.collections.map;

public class Fruit {
    private String name;
    private double weight;

    public Fruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return name + " (" + weight + ")";
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Fruit fruit = (Fruit) o;
        return this.name.equals(fruit.name)
                && this.weight == ((Fruit) o).weight;
    }

}
