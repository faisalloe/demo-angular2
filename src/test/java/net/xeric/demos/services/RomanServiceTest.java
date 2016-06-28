package net.xeric.demos.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by markshead on 4/2/16.
 */
public class RomanServiceTest {
    
	RomanNumberService romanService = new RomanNumberService();

    @Test
    public void testRoman() throws Exception {
    	
        assertEquals("I", romanService.toRoman(1));
        assertEquals("V", romanService.toRoman(5));
    }

}