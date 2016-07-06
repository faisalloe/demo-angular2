package net.xeric.demos.pages;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import org.seleniumhq.selenium.fluent.Period;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * This represents a page in the application. Ideally we want to isolate all the details
 * about the page to this class. That way if we change an id or class name, there is just
 * a single place where we have to update it and our step files can remain unchanged.
 */

@Component
public class DemoPage {

    @Autowired
    private ChromeDriver webDriver;

    private FluentWebDriver fluentWebDriver;
    private NgWebDriver ngWebDriver;



    @Autowired
    public DemoPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @PostConstruct
    public void init(){

        fluentWebDriver = new FluentWebDriver(webDriver);
        ngWebDriver = new NgWebDriver(webDriver);
    }


    void waitForResponse() {

        //long startTime = System.nanoTime();
        ngWebDriver.waitForAngularRequestsToFinish();
        //long stopTime = System.nanoTime();
        //long secs = TimeUnit.SECONDS.convert((stopTime - startTime), TimeUnit.NANOSECONDS);

    }

    public void go() {

        webDriver.get("http://localhost:8080/");
        waitForResponse();
    }

final int WAIT_TIME_SEC = 5;
    void sendFluentKey(FluentWebDriver fwd, String keyName, String keyValue){

        fwd.input(By.id(keyName)).within(Period.secs(WAIT_TIME_SEC)).sendKeys(keyValue);

    }

    void fluentClick(FluentWebDriver fwd, String keyName){

        fwd.button(By.id(keyName)).within(Period.secs(WAIT_TIME_SEC)).click();
        waitForResponse();

    }

    public void addNumbers(int x, int y) {

        //webDriver.findElement(By.id("adder-first-number")).sendKeys(Integer.toString(x));
        //webDriver.findElement(By.id("adder-second-number")).sendKeys(Integer.toString(y));
        //webDriver.findElement(By.id("adder-button")).click();

        sendFluentKey(fluentWebDriver, "adder-first-number", Integer.toString(x));
        sendFluentKey(fluentWebDriver, "adder-second-number", Integer.toString(y));
        fluentClick(fluentWebDriver, "adder-button");


    }

    String getFluentSpanText(FluentWebDriver fwd, String keyName){

        return fwd.span(By.id(keyName)).within(Period.secs(WAIT_TIME_SEC)).getText().toString();

    }
    String getFluentDivText(FluentWebDriver fwd, String keyName){

        return fwd.div(By.id(keyName)).within(Period.secs(WAIT_TIME_SEC)).getText().toString();

    }

    public int getAdderResults() {

        return Integer.parseInt(getFluentSpanText(fluentWebDriver, "adder-result"));
        //return Integer.parseInt(webDriver.findElement(By.id("adder-result")).getText());

    }

    public int getCount() {

        return Integer.parseInt(getFluentDivText(fluentWebDriver, "counter"));
        //return Integer.parseInt(webDriver.findElement(By.id("counter")).getText());

    }

    public void clickIncrement() {

        fluentClick(fluentWebDriver, "increment-button");
        //webDriver.findElement(By.id("increment-button")).click();
    }


    public void toRoman(int x){


        //webDriver.findElement(By.id("to-roman-number")).sendKeys(Integer.toString(x));
    	//webDriver.findElement(By.id("roman-button")).click();
        sendFluentKey(fluentWebDriver, "to-roman-number", Integer.toString(x));
        fluentClick(fluentWebDriver, "roman-button");
    }

    public String getRomanResults() {

        return getFluentSpanText(fluentWebDriver, "roman-result");

        //return webDriver.findElement(By.id("roman-result")).getText();
    }
    
}
