package net.xeric.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * This is the Spring configuration file that allows us to get the webdriver.
 */
@Configuration
public class TestConfig {

    //private FirefoxDriver driver;
/*
    @Bean
    public FirefoxDriver getWebDriver(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        return driver;
    }
*/
    @Bean(destroyMethod = "quit", name = "webDriver")
    public WebDriver getWebDriver() {
        final WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
;
        return driver;
    }

}
