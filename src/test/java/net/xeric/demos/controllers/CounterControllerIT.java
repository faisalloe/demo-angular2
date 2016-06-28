package net.xeric.demos.controllers;

import net.xeric.demos.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

/**
 * Created by markshead on 4/2/16.
 *
 * This tests the controller. It autowires the controller using Spring and verifies that it works
 * as expected. This is different than the service level unit test that are run directly against
 * the class without starting up Spring.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
public class CounterControllerIT {
    @Autowired
    CounterController counterController;

    @Test
    public void testCount() throws Exception {
        assertEquals(0,counterController.count());
        assertEquals(1,counterController.count());
        assertEquals(2,counterController.count());
    }
}