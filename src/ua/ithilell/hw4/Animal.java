package ua.ithilell.hw4;

public abstract class Animal {

    public static int animalsCount;

    private final String name;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        System.out.println(this.name + " runs " + distance + " m.");
    }

    public void swim(int distance) {
        System.out.println(this.name + " swims " + distance + " m.");
    }

}
