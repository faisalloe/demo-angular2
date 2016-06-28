package net.xeric.demos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This represents a page in the application. Ideally we want to isolate all the details
 * about the page to this class. That way if we change an id or class name, there is just
 * a single place where we have to update it and our step files can remain unchanged.
 */

@Component
public class DemoPage {
    @Autowired
    WebDriver driver;

    @Autowired
    public DemoPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void go() {
        driver.get("http://localhost:8080/");
    }

    public void addNumbers(int x, int y) {
        driver.findElement(By.id("adder-first-number")).sendKeys(Integer.toString(x));
        driver.findElement(By.id("adder-second-number")).sendKeys(Integer.toString(y));
        driver.findElement(By.id("adder-button")).click();
    }
    public int getAdderResults() {
        return Integer.parseInt(driver.findElement(By.id("adder-result")).getText());
    }

    public int getCount() {
        return Integer.parseInt(driver.findElement(By.id("counter")).getText());
    }

    public void clickIncrement() {
        driver.findElement(By.id("increment-button")).click();
    }
    
    
    public void toRoman(int x){
    	driver.findElement(By.id("to-roman-number")).sendKeys(Integer.toString(x));
    	driver.findElement(By.id("roman-button")).click();
    }
    
    public String getRomanResults() {
        return driver.findElement(By.id("roman-result")).getText();
    }
    
}
