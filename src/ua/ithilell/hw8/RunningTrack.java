package ua.ithilell.hw8;

public class RunningTrack implements Obstacle {

    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (length > participant.getMaxRunLength()) {
            return false;
        }
        participant.run();
        return true;
    }

}
