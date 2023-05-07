package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

    public void getBOAUrl(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://www.bankofamerica.com/");
    }

    public void clickElement(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    public String getTextMethod (WebDriver driver, By locator) {
       String text = driver.findElement(locator).getText();
       return text;
    }

    public void enterText(WebDriver driver, By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }
}
