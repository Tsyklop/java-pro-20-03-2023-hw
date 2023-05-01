package ua.ithilell.hw8;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (height > participant.getMaxJumpHeight()) {
            return false;
        }
        participant.jump();
        return true;
    }

}
