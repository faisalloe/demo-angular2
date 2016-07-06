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
        assertEquals(1, counterService.increment());
        assertEquals(2, counterService.increment());
        assertEquals(3, counterService.increment());

    }

}