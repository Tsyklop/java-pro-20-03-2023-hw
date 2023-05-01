package ua.ithilell.hw8;

public class Human implements Participant {

    @Override
    public void run() {
        System.out.println("Human run");
    }

    @Override
    public void jump() {
        System.out.println("Human jump");
    }

    @Override
    public int getMaxRunLength() {
        return 5;
    }

    @Override
    public int getMaxJumpHeight() {
        return 5;
    }

}
