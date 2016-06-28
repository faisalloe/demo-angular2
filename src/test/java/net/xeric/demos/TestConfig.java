package net.xeric.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is the Spring configuration file that allows us to get the webdriver.
 */
@Configuration
public class TestConfig {

    @Bean(destroyMethod = "quit")
    public WebDriver getWebDriver() {

        //System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");

        final WebDriver webDriver = new FirefoxDriver();


        return webDriver;
    }
}
