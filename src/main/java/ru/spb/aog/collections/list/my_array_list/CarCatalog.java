package ru.spb.aog.collections.list.my_array_list;

import java.util.Collection;

public class CarCatalog {
    MyArrayList<Car> carList = new MyArrayList<>();

    public static void main(String[] args) {
        CarCatalog carCatalog = new CarCatalog();
        carCatalog.runMethods();
    }

    private void initializeBestCarsCatalog() {
        carList.add(new Car("Ferrari", 2019));
        carList.add(new Car("Mercedes C200", 2019));
        carList.add(new Car("Mercedes S600", 2020));
        carList.add(new Car("Bugatti", 1990));
        carList.add(new Car("Porsche Cayenne", 2018));
        carList.add(new Car("Lamborghini Gallardo", 2020));
        carList.add(new Car("Lamborghini Huracan", 2020));
        carList.add(new Car("Lamborghini Huracan", 2019));
        System.out.println("Car Catalog initialized:\n" + carList.toString());
    }

    private MyArrayList<Car> getRussianCarsCatalog() {
        MyArrayList<Car> russianCarList = new MyArrayList<>();
        russianCarList.add(new Car("Lada Priora", 2018));
        russianCarList.add(new Car("Lada Priora", 2019));
        russianCarList.add(new Car("Vaz 2001", 1961));
        russianCarList.add(new Car("Lada Granta", 2017));
        russianCarList.add(new Car("Gaz 3110", 2003));
        System.out.println("Russian Cars Catalog:\n" + russianCarList.toString());
        return russianCarList;
    }

    public void runMethods() {
        initializeBestCarsCatalog();

        carList.add(new Car("Kia Seed", 2015));
        System.out.println("Kia Seed added to end:\n" + carList.toString());

        carList.add(1, new Car("Tesla", 2020));
        System.out.println("Tesla added to index 1:\n" + carList.toString());

        carList.addAll((Collection<Car>) getRussianCarsCatalog());
        System.out.println("After russian cars adding:\n" + carList.toString());

        carList.remove(3);
        System.out.println("After deleting car by index 3:\n" + carList.toString());

        carList.remove(new Car ("Vaz 2001", 1961));
        System.out.println("After deleting Vaz 2001, 1961:\n" + carList.toString());

        carList.removeRange(2, 5);
        System.out.println("After deleting range [2..5):\n" + carList.toString());

        carList.removeAll((Collection<Car>) getRussianCarsCatalog());
        System.out.println("After deleting all russian cars:\n" + carList.toString());

        carList.ensureCapacity(30);
        System.out.println("After ensureCapacity(30):\n" + carList.toString());

        carList.addAll(3, (Collection<Car>) getRussianCarsCatalog());
        System.out.println("After russian cars adding from index 3:\n" + carList.toString());

        System.out.println("carList.contains(new Car(\"Kia Seed\", 2015)) = " +
                carList.contains(new Car("Kia Seed", 2015)));

        System.out.println("carList.indexOf(new Car(\"Kia Seed\", 2015)) = " +
                carList.indexOf(new Car("Kia Seed", 2015)));

        System.out.println("carList.contains(new Car(\"Kia Seed\", 2016)) = " +
                carList.contains(new Car("Kia Seed", 2016)));

        System.out.println("carList.lastIndexOf(new Car(\"Kia Seed\", 2016)) = " +
                carList.lastIndexOf(new Car("Kia Seed", 2016)));

        System.out.println("carList.get(3) = " + carList.get(3));

        carList.set(0, new Car("BatMobile", 2000));
        System.out.println("After setting BatMobile to position 1:\n" + carList.toString());

        carList.trimToSize();
        System.out.println("After trimToSize():\n" + carList.toString());

        carList.sort();
        System.out.println("After sorting:\n" + carList.toString());

        System.out.println("carList.isEmpty() = " + carList.isEmpty());

        carList.clear();
        System.out.println("After clear():\n" + carList.toString());

        System.out.println("carList.isEmpty() = " + carList.isEmpty());
    }

}
