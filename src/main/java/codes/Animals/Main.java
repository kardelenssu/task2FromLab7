package codes.Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[7];

        zoo[0] = new Dog("Rex", 4, 20.5, true, "German Shepherd");
        zoo[1] = new Dog("Buddy", "Beagle");
        zoo[2] = new Pigeon("Pippa", 2, 0.4, "grey-white", "Rock Pigeon");
        zoo[3] = new Pigeon("Paulie", "Homing Pigeon");
        zoo[4] = new Blowfish("Bubbles", 1, 0.8, "saltwater", true);
        zoo[5] = new Blowfish("Puff", "saltwater");
        zoo[6] = new Mammal("Mammalus", true); // generic mammal

        System.out.println("\nZoo animals:\n");
        for (int i = 0; i < zoo.length; i++) {
            System.out.printf("[%d] %s%n", i, zoo[i].toString());
        }

        System.out.println("\nDemonstrate polymorphic method calls (eat & voice)\n");
        for (int i = 0; i < zoo.length; i++) {
            System.out.printf("[%d] %s says '%s' and then: ", i, zoo[i].getName(), zoo[i].getVoice());
            zoo[i].eat();
        }

        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("Rex", 4, 20.5, true, "German Shepherd");
        behaviors[1] = new Pigeon("Pippa", 2, 0.4, "grey-white", "Rock Pigeon");
        behaviors[2] = new Blowfish("Bubbles", 1, 0.8, "saltwater", true);

        System.out.println("\nAnimalBehavior[] -> sleep()\n");
        for (int i = 0; i < behaviors.length; i++) {
            System.out.print("[" + i + "] ");
            behaviors[i].sleep();
        }

        System.out.println("\nCall move() on each Animal in zoo (uses default or overridden)\n");
        for (Animal a : zoo) {
            a.move();
        }

        System.out.println("\nCall static AnimalName.name(...) for each Animal\n");
        for (Animal a : zoo) {
            AnimalName.name(a.getName());
        }

        System.out.println("\nCall class-specific methods by casting when needed\n");
        ((Dog) zoo[0]).fetch();
        ((Pigeon) zoo[2]).deliverMessage("Hello from Pippa!");
        ((Blowfish) zoo[4]).inflate();

        System.out.println("\nEnd :)");
    }
}