package Lesson5;

public class Animal {
    int eyes;

    public Animal(int eyes) {
        this.eyes = eyes;
    }

    public static void main(String[] args) {
        System.out.println("I am animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {

    static String name;
    int tail = 1;
    int paw = 4;

    public Pet(int eyes) {
        super(eyes);
    }

    public static void main(String[] args) {
        System.out.println("I am pet");
        int eyes = 2;
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet runs« jumps");
    }
}

class Dog extends Pet {
    Dog(String name, int eyes) {
        super(eyes);
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("I am dog and my name is: " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat(String name, int eyes) {
        super(eyes);
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("I am cat and my name is: " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Fluffy", 2);
        Cat cat = new Cat("Simba", 2);
        System.out.println("Dog's number of paws: " + dog.paw);
        cat.sleep();
    }
}
