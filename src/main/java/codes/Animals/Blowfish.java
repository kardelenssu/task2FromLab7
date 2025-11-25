package codes.Animals;

public class Blowfish extends Fish implements AnimalBehavior {
    private boolean isPoisonous;

    public Blowfish() {
        super();
        this.isPoisonous = true; // just default
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean isPoisonous) {
        super(name, age, weight, waterType);
        this.isPoisonous = isPoisonous;
    }

    public Blowfish(String name, String waterType) {
        super(name, waterType);
        this.isPoisonous = true;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    public void inflate() {
        System.out.println(getName() + " puffs up into a ball shape!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish eats small invertebrates.");
    }

    @Override
    public String getVoice() {
        return "(silent underwater)";
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "isPoisonous=" + isPoisonous +
                ", " + super.toString() +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Blowfish) rests near the seabed.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the Blowfish swims.");
    }
}