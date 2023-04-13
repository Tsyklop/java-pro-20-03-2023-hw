package ua.ithilell.hw4;

public class Dog extends Animal {

    public static int dogsCount;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собака не бежит так далеко");
        } else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собака не может плыть так далеко");
        } else {
            super.swim(distance);
        }
    }

}
