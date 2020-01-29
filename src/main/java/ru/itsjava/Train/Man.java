package ru.itsjava.Train;

import java.util.Objects;

public class Man extends Person{

    private double impactForce; // сила удара
    private Woman wife;

    public Man(String name, int age, double height, double weight,
               double impactForce, Woman wife){
        super(name, age, height, weight);
        this.impactForce = impactForce;
        this.wife = wife;
    }

    public double getImpactForce() { return impactForce; }

    public void setImpactForce(float impactForce) { this.impactForce = impactForce; }

    public Woman getWife() { return wife; }

    public void setWife(Woman wife) { this.wife = wife; }

    @Override
    public String toString(){
        return "#Man, " + super.toString() +
                ((wife != null) ?
                        "\n He's married. Wife's name = " + wife.getName() + "." :
                        "\n He isn't married.") +
                " Impact force = " + impactForce + " kg" +
                ((impactForce > 500) ? " >> be careful" : " >> he's not dangerous") + ")#\n";
    }

    @Override
    public boolean equals(Object o){
        // Men are equal
        //      if their age differ by no more than 5
        //      and their both height and weight differ by no more than 5
        //      and their impact force differ by no more 300
        if (this == o) return true;
        if (this == null || this.getClass() != o.getClass()) {
            return false;
        }
        Man man = (Man) o;
        return 6 > Math.abs(this.getAge() - man.getAge()) &&
               6 > Math.abs(this.getHeight() - man.getHeight()) &&
               6 > Math.abs(this.getWeight() - man.getWeight()) &&
               301 > Math.abs(this.impactForce - man.impactForce);
    }

    @Override
    public int hashCode(){
        return (10 * ((this.getAge() + 5) / 10)) +
                (100 * (((int) this.getHeight() + 5) / 10)) +
                (1000 * (((int) this.getWeight() + 5) / 10));
    }
}
