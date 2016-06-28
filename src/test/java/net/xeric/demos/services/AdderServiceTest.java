package net.xeric.demos.services;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by markshead on 4/2/16.
 */
public class AdderServiceTest {
    AdderService adderService = new AdderService();

    @Test
    public void testAdd() throws Exception {
        assertEquals(1, adderService.add(1,0));
        assertEquals(2, adderService.add(1,1));
        assertEquals(10, adderService.add(5,5));
        assertEquals(100, adderService.add(75,25));
    }

    @Test
    public void testAddWithNegativeNumbers() throws Exception {
        assertEquals(-1, adderService.add(-1,0));
        assertEquals(-2, adderService.add(-1,-1));
        assertEquals(0, adderService.add(1,-1));
        assertEquals(-5, adderService.add(5,-10));
        assertEquals(-50, adderService.add(-75,25));

    }
}