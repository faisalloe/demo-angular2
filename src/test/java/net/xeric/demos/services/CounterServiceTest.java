package net.xeric.demos.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by markshead on 4/2/16.
 */
public class CounterServiceTest {
    private CounterService counterService = new CounterService();
    @Test
    public void testCounter() {
        assertEquals(0, counterService.increment());
        assertEquals(1, counterService.increment());
        assertEquals(2, counterService.increment());
        assertEquals(3, counterService.increment());
        assertEquals(4, counterService.increment());
        assertEquals(5, counterService.increment());
        assertEquals(6, counterService.increment());
        assertEquals(7, counterService.increment());
        assertEquals(8, counterService.increment());
        assertEquals(9, counterService.increment());
    }

}