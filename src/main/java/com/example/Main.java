package com.example;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[7];


        zoo[0] = new Dog("Rex", 4, 20.5, true, "German Shepherd");

        zoo[1] = new Dog("Buddy", "Beagle");

        zoo[2] = new Pigeon("Pippa", 2, 0.4, "grey-white", "Rock Pigeon");

        zoo[3] = new Pigeon("Paulie", "Homing Pigeon");

        zoo[4] = new Blowfish("Bubbles", 1, 0.8, "saltwater", true);

        zoo[5] = new Blowfish("Puff", "saltwater");

        zoo[6] = new Mammal("Mammalus", true);

        System.out.println("\nZoo animals:\n ");
        for (int i = 0; i < zoo.length; i++) {
            System.out.printf("[%d] %s%n", i, zoo[i].toString());
        }
        System.out.println("------------------------------------------");
        System.out.println(" Demonstrate polymorphic method calls");
        System.out.println("------------------------------------------");



        for (int i = 0; i < zoo.length; i++) {
            System.out.printf("[%d] %s says '%s' and then: ", i, zoo[i].getName(), zoo[i].getVoice());
            zoo[i].eat();
        }
        System.out.println("------------------------------------------");
        System.out.println("Call class-specific methods by casting when needed");
        System.out.println("------------------------------------------");



        Dog dog0 = (Dog) zoo[0];
        dog0.fetch();

        Dog dog1 = (Dog) zoo[1];
        dog1.fetch();


        ((Pigeon) zoo[2]).deliverMessage("Hello from Pippa!");
        ((Pigeon) zoo[3]).fly();


        ((Blowfish) zoo[4]).inflate();
        ((Blowfish) zoo[5]).swim();


        if (zoo[6] instanceof Mammal) {
            Mammal m = (Mammal) zoo[6];
            m.eat();
            System.out.println(m.getName() + " is domestic? " + m.isDomestic());
        }
        System.out.println("******************************************");
        System.out.println("End :)");
        System.out.println("******************************************");

    }
}