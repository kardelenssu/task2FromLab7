package codes.Animals;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name, 0);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the bird pecks at seeds or insects.");
    }

    @Override
    public String getVoice() {
        return "chirp";
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                ", " + super.toString() +
                '}';
    }
}