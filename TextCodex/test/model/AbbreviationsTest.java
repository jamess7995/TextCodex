package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AbbreviationsTest {

    Abbreviations abr = new Abbreviations("test short version");
    @Test
    void getUserShortVersion() {
        String expResult = "test short version";
        assertEquals(expResult, abr.getUserShortVersion());
    }

    @Test
    void setUserShortVersion() {
        abr.setUserShortVersion("testA");
        assertEquals("testA", abr.getUserShortVersion());
    }


}