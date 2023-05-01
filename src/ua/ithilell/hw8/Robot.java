package ua.ithilell.hw8;

public class Robot implements Participant {

    @Override
    public void run() {
        System.out.println("Robot run");
    }

    @Override
    public void jump() {
        System.out.println("Robot jump");
    }

    @Override
    public int getMaxRunLength() {
        return 10;
    }

    @Override
    public int getMaxJumpHeight() {
        return 2;
    }

}
