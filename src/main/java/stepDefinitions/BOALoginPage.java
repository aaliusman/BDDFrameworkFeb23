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
import pages.LoginPage;
import utils.CommonMethods;

public class BOALoginPage extends InvokeWebDriver {

    WebDriver driver = null;
    String expectedErrorMessage = "The information you entered doesn't match our records. You have a few more tries remaining.";
    CommonMethods commonMethods = new CommonMethods();
    String expectedOpenAccountText = "Open account";
    String expectedCheckingAccountText = "Click to open a checking account.";
    LoginPage loginPage = new LoginPage();

//    @Given("user opens chrome browser")
//    public void user_opens_chrome_browser() {
//        driver = initiateWebDriver();
//    }
//    @When("user enters url")
//    public void user_enters_url() {
//        commonMethods.getBOAUrl(driver);
//    }
    @When("user enters incorrect username and password")
    public void user_enters_incorrect_username_and_password() {
        loginPage.enterUserName(driver, "asdfasdf12");
        loginPage.enterPassword(driver, "3443ioer");
    }
    @When("user clicks saveID button")
    public void user_clicks_save_id_button() {
        loginPage.clickSaveIdButton(driver);
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton(driver);
    }
    @Then("user validate error message")
    public void user_validate_error_message() {
        loginPage.validateErrorMessage(driver, expectedErrorMessage);
    }

    @Then("user validate open account button")
    public void user_validate_open_account_button() throws InterruptedException {
        loginPage.validateOpenAccountButton(driver, expectedOpenAccountText, expectedCheckingAccountText);
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String user, String pass) {
        loginPage.enterUserName(driver, user);
        loginPage.enterPassword(driver, pass);

    }


}
