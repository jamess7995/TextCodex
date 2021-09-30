package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitlesTest {

    Titles tts = new Titles("test Title");
    @Test
    void getUserSetTitle() {
        String expResult = "test Title";
        assertEquals(expResult, tts.getUserSetTitle());
    }

    @Test
    void setUserSetTitle() {
        tts.setUserSetTitle("testT");
        assertEquals("testT", tts.getUserSetTitle());
    }

}