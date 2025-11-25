package codes.Animals;

public interface AnimalMove {
    default void move() {
        System.out.println(this.getClass().getSimpleName() + " moves in a general way.");
    }
}
