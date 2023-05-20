package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.CommonMethods;

public class LoginPage {

    CommonMethods commonMethods = new CommonMethods();

    By userIdInputField = By.cssSelector("#onlineId1");
    By passwordInputField = By.name("passcode1");
    By saveIdButton = By.xpath("//input[@class = 'spa-input-option spa-input-option--checkbox']");
    By loginButton = By.cssSelector("#signIn");
    By errorMessage = By.xpath("//div[@class='error-message']/li");
    By openAccountButton = By.cssSelector("#open");


    public void enterUserName(WebDriver driver, String username) {
        commonMethods.enterText(driver, userIdInputField, username);
    }

    public void enterPassword(WebDriver driver, String password) {
        commonMethods.enterText(driver, passwordInputField, password);
    }

    public void clickSaveIdButton(WebDriver driver) {
        commonMethods.clickElement(driver, saveIdButton);
    }

    public void clickLoginButton (WebDriver driver) {
        commonMethods.clickElement(driver, loginButton);
    }

    public void validateErrorMessage (WebDriver driver, String expectedErrorMessage) {
        String actualErrorMessage = commonMethods.getTextMethod(driver, errorMessage);
        boolean validateErrorMessage = actualErrorMessage.contains(expectedErrorMessage);
        Assert.assertTrue(validateErrorMessage);
    }

    public void validateOpenAccountLink(WebDriver driver, String expectedOpenLinkText) throws InterruptedException {
        Thread.sleep(1000);
        boolean isOpenAccountLinkDisplayed = driver.findElement(openAccountButton).isDisplayed();
        String actualText = commonMethods.getTextMethod(driver, openAccountButton);
        Assert.assertTrue(isOpenAccountLinkDisplayed, "Open account link is not displayed");
        Assert.assertEquals(actualText, expectedOpenLinkText);
    }

}
