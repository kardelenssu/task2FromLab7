package codes.Animals;

public class Pigeon extends Bird implements AnimalBehavior {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "grey");
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void deliverMessage(String message) {
        System.out.println(getName() + " the " + species + " delivers message: " + message);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the pigeon pecks at grains.");
    }

    @Override
    public String getVoice() {
        return "coo";
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                ", " + super.toString() +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Pigeon) tucks head under wing and sleeps.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the Pigeon flies.");
    }
}