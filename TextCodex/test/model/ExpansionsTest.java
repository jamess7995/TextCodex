package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpansionsTest {

    Expansions exp = new Expansions("test long version");
    @Test
    void getUserLongVersion() {
        String expResult = "test long version";
        assertEquals(expResult, exp.getUserLongVersion());
    }

    @Test
    void setUserLongVersion() {
        exp.setUserLongVersion("testL");
        assertEquals("testL", exp.getUserLongVersion());
    }

}