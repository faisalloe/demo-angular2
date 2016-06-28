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
public class AdderControllerIT {

    @Autowired
    AdderController adderController;

    @Test
    public void testAdder() throws Exception {
        assertEquals(2,adderController.adder(1,1));
        assertEquals(3,adderController.adder(2,1));
        assertEquals(1000,adderController.adder(999,1));
    }
}