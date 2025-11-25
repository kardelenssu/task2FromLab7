package codes.Animals;

public class Fish extends Animal {
    private String waterType;

    public Fish() {
        super();
        this.waterType = "unknown";
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, String waterType) {
        super(name, 0);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public void swim() {
        System.out.println(getName() + " is swimming in " + waterType + " water.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the fish nibbles on flakes or small organisms.");
    }

    @Override
    public String getVoice() {
        return "(bloop)";
    }

    @Override
    public String toString() {
        return "Fish{" +
                "waterType='" + waterType + '\'' +
                ", " + super.toString() +
                '}';
    }
}
