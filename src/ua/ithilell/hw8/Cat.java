package ua.ithilell.hw8;

public class Cat implements Participant {
    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void jump() {
        System.out.println("Cat jump");
    }

    @Override
    public int getMaxRunLength() {
        return 10;
    }

    @Override
    public int getMaxJumpHeight() {
        return 10;
    }

}
