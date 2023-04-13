package ua.ithilell.hw4;

public class Cat extends Animal {

    public static int catsCount;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Кот не бежит так далеко");
        } else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    public void sharpenClaws() {

    }

}
