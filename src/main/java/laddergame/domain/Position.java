package laddergame.domain;

public class Position {

    private Direction direction;

    public Position(int idx, int horizonIdx, int length) {
        this.direction = new Direction(idx, horizonIdx, length - 1);
    }

    public int getDirection() {
        return this.direction.whereDirection();
    }

    public int move(int idx) {
        if (getDirection() == Direction.NONE) {
            return idx;
        }
        return moveRorL(idx);
    }

    public int moveRorL(int idx) {
        if (getDirection() == Direction.RIGHT) {
            return idx + 1;
        }
        return idx - 1;
    }

}
