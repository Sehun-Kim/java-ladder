package laddergame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LadderGameTest {
    @Before
    public void setUp(){

    }

    @Test
    public void randLine(){
        assertEquals("-", LadderGame.randLine(1));
    }

    @Test
    public void checkLine(){
        assertEquals("|", LadderGame.checkLine(0));
    }

}