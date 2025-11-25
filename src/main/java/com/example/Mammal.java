package com.example;

public class Mammal extends Animal {
    private boolean isDomestic;

    public Mammal() {
        super();
        this.isDomestic = false;
    }

    public Mammal(String name, int age, double weight, boolean isDomestic) {
        super(name, age, weight);
        this.isDomestic = isDomestic;
    }

    public Mammal(String name, boolean isDomestic) {
        super(name, 0);
        this.isDomestic = isDomestic;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the mammal is eating typical mammal food.");
    }

    @Override
    public String getVoice() {
        return "(generic mammal noise)";
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "isDomestic=" + isDomestic +
                ", " + super.toString() +
                '}';
    }
}