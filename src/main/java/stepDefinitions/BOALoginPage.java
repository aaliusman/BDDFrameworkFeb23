package stepDefinitions;

import driver.InvokeWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.CommonMethods;

public class BOALoginPage extends InvokeWebDriver {

    WebDriver driver = null;
    String expectedErrorMessage = "The information you entered doesn't match our records. You have a few more tries remaining.";
    CommonMethods commonMethods = new CommonMethods();
    String expectedOpenAccountText = "Open account";
    String expectedCheckingAccountText = "Click to open a checking account.";
    @Given("user opens chrome browser")
    public void user_opens_chrome_browser() {
        driver = initiateWebDriver();
    }
    @When("user enters url")
    public void user_enters_url() {
        commonMethods.getBOAUrl(driver);
    }
    @When("user enters incorrect username and password")
    public void user_enters_incorrect_username_and_password() {
        commonMethods.enterText(driver, By.cssSelector("#onlineId1"), "asdjflkl");
        commonMethods.enterText(driver, By.name("passcode1"), "@#%FSf");
    }
    @When("user clicks saveID button")
    public void user_clicks_save_id_button() {
        commonMethods.clickElement(driver, By.xpath("//input[@class = 'spa-input-option spa-input-option--checkbox']"));
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        commonMethods.clickElement(driver, By.cssSelector("#signIn"));
    }
    @Then("user validate error message")
    public void user_validate_error_message() {
        String actualErrorMessage = commonMethods.getTextMethod(driver, By.xpath("//div[@class='error-message']/li"));
        boolean validateErrorMessage = actualErrorMessage.contains(expectedErrorMessage);
        Assert.assertTrue(validateErrorMessage);
    }

    @Then("user validate open account button")
    public void user_validate_open_account_button() {
        boolean isOpenAccountButtonDisplayed = driver.findElement(By.cssSelector(".spa-btn.spa-btn--primary.spa-btn--medium.masthead-cta-btn")).isDisplayed();
        String actualText = commonMethods.getTextMethod(driver, By.cssSelector(".spa-btn.spa-btn--primary.spa-btn--medium.masthead-cta-btn"));
        boolean validateText = actualText.contains(expectedOpenAccountText);
        Assert.assertTrue(isOpenAccountButtonDisplayed, "Open account button is not displayed");
        Assert.assertTrue(validateText, "Open account text is not displayed");
        boolean validateHiddenCheckingText = actualText.contains(expectedCheckingAccountText);
        Assert.assertTrue(validateHiddenCheckingText);
    }

    @After
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
