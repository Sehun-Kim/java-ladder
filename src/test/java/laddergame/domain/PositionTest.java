package laddergame.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {

    Position p;

    @Before
    public void setUp() {
        int idx = 1;
        int horizonIdx = 1;
        int length = 4;

        // direction = right
        p = new Position(idx, horizonIdx,length);
    }

    @Test
    public void move() {
        // direction == RIGHT => idx + 1
        assertEquals(2, p.move(1));
    }

}