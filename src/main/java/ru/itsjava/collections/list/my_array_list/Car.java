package ru.itsjava.collections.list.my_array_list;

public class Car implements Comparable<Car> {

    private String name;
    private int year;

    public Car(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        int compareResult = this.name.compareTo(o.name);
        if (compareResult == 0){
            return this.year - o.year;
        }
        return compareResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return this.name.compareTo(car.name) == 0 &&
                this.year == car.year;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 100 * year;
    }

    @Override
    public String toString() {
        return '[' + name + ", " + year +']';
    }
}
