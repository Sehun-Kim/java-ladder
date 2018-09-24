package laddergame.domain;

public class Direction {

    public static final int NONE = 0; // 방향 없음
    public static final int LEFT = 1; // 왼쪽으로 이동
    public static final int RIGHT = 2; // 오른쪽으로 이동

    private int direction;

    public Direction(int idx, int horizonIdx, int lastIdx) {
        this.direction = makeDirection(idx, horizonIdx, lastIdx);
    }

    public static int makeDirection(int idx, int horizonIdx, int lastIdx) {
        if (idx == horizonIdx || idx == horizonIdx + 1) {
            return checkLastIdx(idx, horizonIdx, lastIdx);
        }
        return NONE;
    }

    // horizonIdx가 마지막 idx와 값이 같으면 무조건 NONE이 나오게
    public static int checkLastIdx(int idx, int horizonIdx, int lastIdx) {
        if (horizonIdx == lastIdx) {
            return NONE;
        }
        return checkLeftOrRight(idx, horizonIdx);
    }

    public static int checkLeftOrRight(int idx, int horizonIdx) {
        if (idx == horizonIdx + 1) {
            return LEFT;
        }
        return RIGHT;
    }

    public int whereDirection() {
        return this.direction;
    }

}
