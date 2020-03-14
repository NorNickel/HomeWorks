package ru.spb.aog.oop.train;

import java.io.Serializable;

public class Woman extends Person implements Serializable {
    private static final String[] HAIR_COLORS = new String[]
            {"blond", "brunette", "brown", "hairless"};
    public static final int HAIR_COLOR_BLOND = 0;
    public static final int HAIR_COLOR_BRUNET = 1;
    public static final int HAIR_COLOR_BROWN = 2;
    public static final int HAIR_COLOR_HAIRLESS = 3;

    private static final String[] EYE_COLORS = new String[]
            {"brown", "blue", "grey", "green"};
    public static final int EYES_COLOR_BROWN = 0;
    public static final int EYES_COLOR_BLUE = 1;
    public static final int EYES_COLOR_GREY = 2;
    public static final int EYES_COLOR_GREEN = 3;

    private int hairColor;
    private int eyeColor;
    private int charmPower;
    private Man husband;

    public Woman(String name, int age, double height, double weight,
                 int hairColor, int eyeColor, int charmPower, Man husband) {
        super(name, age, height, weight);
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.charmPower = charmPower;
        this.husband = husband;
    }

    public int getHairColor() { return hairColor; }

    public void setHairColor(int hairColor) { this.hairColor = hairColor; }

    public int getEyeColor() { return eyeColor; }

    public void setEyeColor(int eyeColor) { this.eyeColor = eyeColor; }

    public double getCharmPower() { return charmPower; }

    public void setCharmPower(int charmPower) { this.charmPower = charmPower; }

    public Man getHusband() { return husband; }

    public void setHusband(Man husband) { this.husband = husband; }

    @Override
    public String toString(){
        return "#Woman, " + super.toString() +
                " , hair color = " + HAIR_COLORS[hairColor] +
                " , eye color = " + EYE_COLORS[eyeColor] +
                ((husband != null) ?
                        "\n She's married. Husband's name = " + husband.getName() + ".":
                        "\n She's not married.") +
                " Power of charm = " + charmPower +
                ((charmPower > 5) ? " >> be careful" : " >> not dangerous") + ")#\n";
    }

    @Override
    public boolean equals(Object o){
        // Women are equal
        //      their age differ by no more 5,
        //      and their both hair color and eye color equal,
        //      and their power of charm differ by no more 3,
        //      and they both married or not married.
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Woman woman = (Woman) o;
        return 5 > Math.abs(this.getAge() - woman.getAge()) &&
               this.hairColor == woman.hairColor &&
               this.eyeColor == woman.eyeColor &&
               4 > Math.abs(this.charmPower - woman.charmPower) &&
               (this.husband == null) == (woman.husband == null);
    }

    @Override
    public int hashCode(){
        return (10 * ((this.getAge() + 5) / 10)) +
                (100 * (1 + hairColor)) +
                (1000 * (1 + eyeColor));
    }
}
