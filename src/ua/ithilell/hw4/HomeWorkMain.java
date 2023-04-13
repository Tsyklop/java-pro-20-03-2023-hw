package ua.ithilell.hw4;

public class HomeWorkMain {

    public static void main(String[] args) {

        Cat cat = new Cat("Тузик");
        Dog dog = new Dog("Бобик");

        cat.sharpenClaws();

        Animal cat1 = new Cat("Барсик");
        Animal dog1 = new Dog("Пупсик");

        //cat1.sharpenClaws();

        //System.out.println(cat.toString());
        //System.out.println(cat1.toString());

        // Object -> Animal -> Cat/Dog

        Animal[] animals = new Animal[]{
                new Cat("Барсик"),
                new Dog("Пупсик")
        };

    }

}
