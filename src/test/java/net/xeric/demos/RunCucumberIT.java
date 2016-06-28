package net.xeric.demos;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;

/**
 * Created by markshead on 4/2/16.
 */



@RunWith(Cucumber.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
public class RunCucumberIT {
}
