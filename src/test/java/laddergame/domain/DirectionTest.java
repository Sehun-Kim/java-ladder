package laddergame.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirectionTest {

    @Test
    public void makeDirection() {
        int lastIdx = 2;
        int idx = 1;
        int horizonIdx = 1;
        assertEquals(2, Direction.makeDirection(idx,horizonIdx,lastIdx));
    }

}