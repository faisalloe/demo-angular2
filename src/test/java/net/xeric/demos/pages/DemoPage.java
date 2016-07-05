package net.xeric.demos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import org.seleniumhq.selenium.fluent.Period;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * This represents a page in the application. Ideally we want to isolate all the details
 * about the page to this class. That way if we change an id or class name, there is just
 * a single place where we have to update it and our step files can remain unchanged.
 */

@Component
public class DemoPage {

    @Autowired
    private WebDriver webDriver;

    private FluentWebDriver fWebDriver;

    @Autowired
    public DemoPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @PostConstruct
    public void init(){
        fWebDriver = new FluentWebDriver(webDriver);
    }


    public void go() {

        webDriver.get("http://localhost:8080/");
    }


    void sendFluentKey(FluentWebDriver fwd, String keyName, String keyValue){

        fwd.input(By.id(keyName)).within(Period.secs(10)).sendKeys(keyValue);

    }

    void fluentClick(FluentWebDriver fwd, String keyName){

        fwd.button(By.id(keyName)).within(Period.secs(10)).click();

    }

    public void addNumbers(int x, int y) {

        //webDriver.findElement(By.id("adder-first-number")).sendKeys(Integer.toString(x));
        //webDriver.findElement(By.id("adder-second-number")).sendKeys(Integer.toString(y));
        //webDriver.findElement(By.id("adder-button")).click();

        sendFluentKey(fWebDriver, "adder-first-number", Integer.toString(x));
        sendFluentKey(fWebDriver, "adder-second-number", Integer.toString(y));
        fluentClick(fWebDriver, "adder-button");


    }

    String getFluentSpanText(FluentWebDriver fwd, String keyName){

        return fwd.span(By.id(keyName)).within(Period.secs(10)).getText().toString();

    }
    String getFluentDivText(FluentWebDriver fwd, String keyName){

        return fwd.div(By.id(keyName)).within(Period.secs(10)).getText().toString();

    }

    public int getAdderResults() {

        return Integer.parseInt(getFluentSpanText(fWebDriver, "adder-result"));
        //return Integer.parseInt(webDriver.findElement(By.id("adder-result")).getText());

    }

    public int getCount() {

        return Integer.parseInt(getFluentDivText(fWebDriver, "counter"));
        //return Integer.parseInt(webDriver.findElement(By.id("counter")).getText());

    }

    public void clickIncrement() {

        fluentClick(fWebDriver, "increment-button");
        //webDriver.findElement(By.id("increment-button")).click();
    }


    public void toRoman(int x){


        //webDriver.findElement(By.id("to-roman-number")).sendKeys(Integer.toString(x));
    	//webDriver.findElement(By.id("roman-button")).click();
        sendFluentKey(fWebDriver, "to-roman-number", Integer.toString(x));
        fluentClick(fWebDriver, "roman-button");
    }

    public String getRomanResults() {

        return getFluentSpanText(fWebDriver, "roman-result");

        //return webDriver.findElement(By.id("roman-result")).getText();
    }
    
}
