package com.makers.smile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SmileTest {
    
    @Test
    void testConstruct() {
        Smile smile = new Smile();

        assertEquals(null, smile.getIsCrying());
        assertEquals(null, smile.getIsLaughing());

        smile = new Smile(true, false);
        assertEquals(true, smile.getIsCrying());

        smile = new Smile(false, true);
        assertEquals(true, smile.getIsLaughing());
    }

    @Test
    void testSetIsCrying() {
        Smile smile = new Smile();
        smile.setIsCrying(true);
        assertEquals(true, smile.getIsCrying());

        smile.setIsCrying(false);
        assertEquals(false, smile.getIsCrying());
    }

    @Test
    void testSetIsLaughing() {
        Smile smile = new Smile();
        smile.setIsLaughing(true);
        assertEquals(true, smile.getIsLaughing());
        
        smile.setIsLaughing(false);
        assertEquals(false, smile.getIsLaughing());
    }
}
