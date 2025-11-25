package codes.Animals;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, boolean isDomestic, String breed) {
        super(name, age, weight, isDomestic);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, true); // assume named dog is domestic by default
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void fetch() {
        System.out.println(getName() + " the " + breed + " is fetching the ball!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the dog happily eats dog food.");
    }

    @Override
    public String getVoice() {
        return "woof";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", " + super.toString() +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Dog) curls up and sleeps.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " the Dog runs.");
    }
}