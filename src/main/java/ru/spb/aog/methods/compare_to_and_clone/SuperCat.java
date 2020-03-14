package ru.spb.aog.methods.compare_to_and_clone;

public class SuperCat implements Cloneable, Comparable<SuperCat> {
    private String name;
    private double power;
    private boolean isCloned;

    public SuperCat(String name, double power){
        this.name = name;
        this.power = power;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getPower() { return power; }

    public void setPower(double power) { this.power = power; }

    public boolean isCloned() { return isCloned; }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SuperCat clonedSuperCat = (SuperCat) super.clone();
        clonedSuperCat.isCloned = true;
        return clonedSuperCat;
    }

    @Override
    public int compareTo(SuperCat o) {
        return (int) Math.signum(this.power - o.power);
    }

    @Override
    public String toString(){
        return name
                + (isCloned ? " *cloned*": "")
                + ", power = " + power;
    }
}
